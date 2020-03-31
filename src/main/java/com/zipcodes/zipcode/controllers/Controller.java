package com.zipcodes.zipcode.controllers;

import java.util.List;


import com.zipcodes.zipcode.models.entity.ZipCode;
import com.zipcodes.zipcode.services.IZipCodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Controller {
    @Autowired
    private IZipCodeService zipCodeService;

    @GetMapping(value = "/ZipCodes")
    public List<ZipCode> GetAll() {
        return zipCodeService.findAll();
    }
    @GetMapping(value="/ZipCodes/{zipcode}")
    public ResponseEntity<ZipCode> GetById(@PathVariable Integer zipcode) {
        ZipCode zip_code=zipCodeService.findByZipCode(zipcode);
        if (zip_code!=null){
            return new ResponseEntity<ZipCode>(zip_code, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }
    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handleException(NumberFormatException ex)
    {
        return new ResponseEntity<String>("It needs to recive a Ineger value",HttpStatus.BAD_REQUEST);
    }
    
}
