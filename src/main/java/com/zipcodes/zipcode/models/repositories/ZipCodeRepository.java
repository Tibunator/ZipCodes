package com.zipcodes.zipcode.models.repositories;
import com.zipcodes.zipcode.models.entity.*;
import org.springframework.data.repository.CrudRepository;
public interface ZipCodeRepository extends CrudRepository<ZipCode, Integer> {
        
}