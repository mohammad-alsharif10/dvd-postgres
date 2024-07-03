package com.dvd.postgres.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.dvd.postgres.entity.Category}
 */
public record CategoryDto(Integer id, String name, Instant lastUpdate) implements Serializable {
}