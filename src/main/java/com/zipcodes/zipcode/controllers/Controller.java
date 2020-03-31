package com.zipcodes.zipcode.controllers;

import java.util.List;

import com.zipcodes.zipcode.models.entity.ZipCode;
import com.zipcodes.zipcode.services.IZipCodeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


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
    public ZipCode GetById(@PathVariable Integer zipcode) {
        return zipCodeService.findByZipCode(zipcode);
    }
    
}