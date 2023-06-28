package com.cgi.gestion_clients.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="details_client")
public class DetailsClient {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String email;
	@JsonIgnore
	private Integer telephone;
	
	// Pour créer une association bidirectionnelle
	@OneToOne(mappedBy = "detailsClient")
	@JsonBackReference
	//@JsonIgnoreProperties
	private Client client;
	
	public DetailsClient() {
		
	}
	
	public DetailsClient(String email, Integer telephone) {
		super();
		this.email = email;
		this.telephone = telephone;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, telephone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetailsClient other = (DetailsClient) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(telephone, other.telephone);
	}
	@Override
	public String toString() {
		return "DetailsClient [id=" + id + ", email=" + email + ", telephone=" + telephone + "]";
	}
	
}
