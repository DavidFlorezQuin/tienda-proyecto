package com.registro.Entity.Operational;


import com.registro.Entity.ABaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "supply")
public class Supply extends ABaseEntity {

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "code", length = 50, nullable = false)
    private String code;


    @Column(name = "description", length = 50, nullable = false)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "unit_measurement_id", nullable = false)
    private UnitMeasurement unitMeasurement;

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

    public UnitMeasurement getUnitMeasurement() {
        return unitMeasurement;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setUnitMeasurement(UnitMeasurement unitMeasurement) {
        this.unitMeasurement = unitMeasurement;
    }
}
