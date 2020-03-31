package com.zipcodes.zipcode.tests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.zipcodes.zipcode.models.entity.ZipCode;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ZipCodeControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void findsZipCodeById() {
        // act
        ZipCode task = restTemplate.getForObject("http://localhost:" + port + "/ZipCodes/1", ZipCode.class);

        // assert
        assertThat(task)
                .extracting(ZipCode::getD_codigo, ZipCode::getD_ciudad, ZipCode::getD_estado, ZipCode::getD_mnpio);
    }
}