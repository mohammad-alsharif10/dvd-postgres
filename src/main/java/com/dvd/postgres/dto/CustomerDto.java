package com.dvd.postgres.dto;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

/**
 * DTO for {@link com.dvd.postgres.entity.Customer}
 */
public record CustomerDto(Integer id, Short storeId, String firstName, String lastName, String email, AddressDto address, Boolean activebool, LocalDate createDate, Instant lastUpdate, Integer active) implements Serializable {
  }