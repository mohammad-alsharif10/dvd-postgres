package com.dvd.postgres.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.dvd.postgres.entity.Country}
 */
public record CountryDto(Integer id, String country, Instant lastUpdate) implements Serializable {
}