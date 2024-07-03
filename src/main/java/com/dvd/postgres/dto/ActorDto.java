package com.dvd.postgres.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.dvd.postgres.entity.Actor}
 */
public record ActorDto(Integer id, String firstName, String lastName, Instant lastUpdate) implements Serializable {
}