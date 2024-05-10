package com.registro.Entity.Security;

import java.time.LocalDate;

import com.registro.Entity.ABaseEntity;
import com.registro.Entity.Geo.City;
import jakarta.persistence.*;

import javax.swing.text.View;

@Entity
@Table(name = "person")
public class Person extends ABaseEntity {
    
    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;

    @Column(name = "phone", length = 15, nullable = false)
    private String phone;

    @Column(name = "date_birth", nullable = false)
    private LocalDate dateBirth;

	@Column(name = "type_document", length = 50, nullable = false, unique = false)
	private String typeDocument;

	@Column(name = "number_document", length = 50, nullable = false, unique = true)
	private String numberDocument;

    @Column(name = "gender", length = 10, nullable = false)
    private String gender;

    @Column(name = "address", length = 100, nullable = false)
    private String address;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "city_id", nullable = false)
	private City city;

}
