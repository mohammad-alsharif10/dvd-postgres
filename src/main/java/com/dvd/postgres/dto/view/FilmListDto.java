package com.dvd.postgres.dto.view;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.dvd.postgres.entity.view.FilmList}
 */
public record FilmListDto(Integer fid, String title, String description, String category, BigDecimal price,
                          Short length, String actors, Object rating) implements Serializable {
}