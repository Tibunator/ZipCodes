package com.zipcodes.zipcode;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.zipcodes.zipcode.models.entity.*;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;
	
	@Autowired
	public StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	public DataSource dataSource;

	@Bean
	public FlatFileItemReader<ZipCodeComplete> reader() {
		return new FlatFileItemReaderBuilder<ZipCodeComplete>()
		  .name("ZipCodeItemReader")		
		  .resource(new ClassPathResource("CPdescarga.csv"))
		  .delimited()
		  .names(new String[]{ "d_codigo", "d_asenta", "d_tipo_asenta", "D_mnpio", "d_estado", "d_ciudad", "d_CP",
				  "c_estado", "c_oficina", "c_CP", "c_tipo_asenta", "c_mnpio", "id_asenta_cpcons", "d_zona",
				  "c_cve_ciudad"})
		  .fieldSetMapper(new BeanWrapperFieldSetMapper<ZipCodeComplete>() {{
			   setTargetType(ZipCodeComplete.class);
		  }})
		  .linesToSkip(1)
		  .build();
	} 	
	
	@Bean
	public JdbcBatchItemWriter<ZipCode> writer() {
		return new JdbcBatchItemWriterBuilder<ZipCode>()
				   .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<ZipCode>())
				   .sql("INSERT INTO Zip_Code(d_codigo, D_mnpio,"
							+ "d_estado, d_ciudad) VALUES(:d_codigo, :D_mnpio, :d_estado, :d_ciudad)")
				   .dataSource(dataSource)
				   .build();
	}
	
	@Bean
	public Job createZipcodeJob(Step step1) {
		return jobBuilderFactory
		  .get("createZipCodeJob")
		  .incrementer(new RunIdIncrementer())
		  .flow(step1)
		  .end()
		  .build();
	}
	@Bean
	public Step step1(ItemReader<ZipCodeComplete> reader, ItemWriter<ZipCode> writer) {
		return stepBuilderFactory
		  .get("step1")
		  .<ZipCodeComplete, ZipCode>chunk(1)
		  .reader(reader)
		  .writer(writer)
		  .build();
	}
}
