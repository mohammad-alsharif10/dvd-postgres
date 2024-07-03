package com.dvd.postgres.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "city", schema = "public", indexes = {
        @Index(name = "idx_fk_country_id", columnList = "country_id")
})
public class City {
    @Id
    @ColumnDefault("nextval('city_city_id_seq'::regclass)")
    @Column(name = "city_id", nullable = false)
    private Integer id;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @ColumnDefault("now()")
    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

}