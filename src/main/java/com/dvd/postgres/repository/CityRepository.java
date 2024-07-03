package com.dvd.postgres.repository;

import com.dvd.postgres.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}