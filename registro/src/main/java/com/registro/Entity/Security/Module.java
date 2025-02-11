package com.registro.Entity.Security;

import com.registro.Entity.ABaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "module")
public class Module  extends ABaseEntity {
	@Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "description", length = 50, nullable = false, unique = true)
    private String description;

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
    
    
}
