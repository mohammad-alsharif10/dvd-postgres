package com.dvd.postgres.repository;

import com.dvd.postgres.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {
}