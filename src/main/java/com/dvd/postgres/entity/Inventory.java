package com.dvd.postgres.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "inventory", schema = "public", indexes = {
        @Index(name = "idx_store_id_film_id", columnList = "store_id, film_id")
})
public class Inventory {
    @Id
    @ColumnDefault("nextval('inventory_inventory_id_seq'::regclass)")
    @Column(name = "inventory_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    @Column(name = "store_id", nullable = false)
    private Short storeId;

    @ColumnDefault("now()")
    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

}