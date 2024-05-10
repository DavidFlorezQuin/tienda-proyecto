package com.registro.Entity.Operational;

import com.registro.Entity.ABaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends ABaseEntity {
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "description", length = 50,  nullable = false)
    private String description;

    @Column(name = "code", length = 50,  nullable = false)
    private String code;

    @Column(name = "price", length = 50, nullable = false)
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
