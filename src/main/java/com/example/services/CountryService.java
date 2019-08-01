package com.example.services;

import java.util.List;

import com.example.model.Country;
import com.example.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> findAll() {
        List<Country> countries = (List<Country>) repository.findAll();
        countries.stream().forEach(System.out::println);
        return countries;
    }

}