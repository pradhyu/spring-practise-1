package com.example.repositories;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.example.model.Country;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
}
