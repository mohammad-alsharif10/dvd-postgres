package com.dvd.postgres.repository;

import com.dvd.postgres.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}