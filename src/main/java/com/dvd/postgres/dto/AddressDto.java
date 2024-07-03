package com.dvd.postgres.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link com.dvd.postgres.entity.Address}
 */
public record AddressDto(Integer id, String address, String address2, String district, CityDto city, String postalCode,
                         String phone, Instant lastUpdate) implements Serializable {
}