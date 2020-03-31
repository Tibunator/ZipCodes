package com.zipcodes.zipcode.services;

import java.util.List;

import com.zipcodes.zipcode.models.entity.ZipCode;

public interface IZipCodeService {
    public List<ZipCode> findAll();
    public ZipCode findByZipCode(Integer zipcode);
}