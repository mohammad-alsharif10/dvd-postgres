package com.dvd.postgres.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.dvd.postgres.entity.City}
 */
public record CityDto(Integer id, String city, CountryDto country, Instant lastUpdate) implements Serializable {
}