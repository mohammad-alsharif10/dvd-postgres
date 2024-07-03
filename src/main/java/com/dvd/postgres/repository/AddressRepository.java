package com.dvd.postgres.repository;

import com.dvd.postgres.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}