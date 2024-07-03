package com.dvd.postgres.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "sales_by_store")
public class SalesByStore {
    @Column(name = "store", length = Integer.MAX_VALUE)
    private String store;

    @Column(name = "manager", length = Integer.MAX_VALUE)
    private String manager;

    @Column(name = "total_sales")
    private BigDecimal totalSales;

}