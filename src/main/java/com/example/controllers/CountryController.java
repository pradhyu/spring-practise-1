package com.example.controllers;

import java.util.List;

import com.example.model.Country;
import com.example.services.ICountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    ICountryService countryService;

    @RequestMapping("/countries")
    public List<Country> listCountries() {
        List<Country> countries = countryService.findAll();
        return countries;
    }
}