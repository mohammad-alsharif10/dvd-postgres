package com.dvd.postgres.repository;

import com.dvd.postgres.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Integer> {
}