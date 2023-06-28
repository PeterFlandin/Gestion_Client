package com.cgi.Gestion_clients.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "details_client")
public class DetailsClilent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private Integer password;
    private Integer telephone;

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getEmail() {
	return this.email;
    }

    public DetailsClilent(String email, Integer telephone) {
	super();
	this.email = email;
	this.telephone = telephone;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public Integer getPassword() {
	return this.password;
    }

    public void setPassword(Integer password) {
	this.password = password;
    }

    public Integer getTelephone() {
	return this.telephone;
    }

    public void setTelephone(Integer telephone) {
	this.telephone = telephone;
    }

    @Override
    public String toString() {
	return "DetailsClilent [id=" + this.id + ", email=" + this.email + ", password=" + this.password
		+ ", telephone=" + this.telephone + "]";
    }

    @Override
    public int hashCode() {
	return Objects.hash(email, id, password, telephone);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	DetailsClilent other = (DetailsClilent) obj;
	return Objects.equals(this.email, other.email) && Objects.equals(this.id, other.id)
		&& Objects.equals(this.password, other.password) && Objects.equals(this.telephone, other.telephone);
    }

    public DetailsClilent() {
	super();
	// TODO Auto-generated constructor stub
    }

}
