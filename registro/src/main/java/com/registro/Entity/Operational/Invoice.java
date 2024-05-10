package com.registro.Entity.Operational;


import com.registro.Entity.ABaseEntity;
import com.registro.Entity.Security.Client;
import jakarta.persistence.*;

@Entity
@Table(name = "invoice")
public class Invoice extends ABaseEntity {
    @Column(name = "total", length = 50, nullable = false)
    private Double total;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }


}
