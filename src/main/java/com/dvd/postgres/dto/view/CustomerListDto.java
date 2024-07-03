package com.dvd.postgres.dto.view;

import java.io.Serializable;

/**
 * DTO for {@link com.dvd.postgres.entity.view.CustomerList}
 */
public record CustomerListDto(Integer id, String name, String address, String zipCode, String phone, String city,
                              String country, String notes, Short sid) implements Serializable {
}