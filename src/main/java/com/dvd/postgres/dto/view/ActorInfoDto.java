package com.dvd.postgres.dto.view;

import java.io.Serializable;

/**
 * DTO for {@link com.dvd.postgres.entity.view.ActorInfo}
 */
public record ActorInfoDto(Integer actorId, String firstName, String lastName,
                           String filmInfo) implements Serializable {
}