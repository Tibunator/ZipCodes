package com.zipcodes.zipcode.services;

import java.util.List;

import com.zipcodes.zipcode.models.entity.ZipCode;
import com.zipcodes.zipcode.models.repositories.ZipCodeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ZipCodeService implements IZipCodeService {

    @Autowired
    private ZipCodeRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<ZipCode> findAll() {
        List<ZipCode> response = (List<ZipCode>)repository.findAll();
        return response;
    }

    @Override
    @Transactional(readOnly = true)
    public ZipCode findByZipCode(Integer zipcode) {
        return repository.findById(zipcode).orElse(null);
    }
}