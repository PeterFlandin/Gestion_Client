package com.cgi.Gestion_clients.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String adresse;
    @OneToOne
    @JoinColumn(name = "id_detail_clients")
    private DetailsClilent detailsClilent;

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getNom() {
	return this.nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public String getAdresse() {
	return this.adresse;
    }

    public void setAdresse(String adresse) {
	this.adresse = adresse;
    }

    public DetailsClilent getDetailsClilent() {
	return this.detailsClilent;
    }

    public void setDetailsClilent(DetailsClilent detailsClilent) {
	this.detailsClilent = detailsClilent;
    }

    public Client() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Client(String nom, String adresse, DetailsClilent detailsClilent) {
	super();
	this.nom = nom;
	this.adresse = adresse;
	this.detailsClilent = detailsClilent;
    }

    @Override
    public int hashCode() {
	return Objects.hash(adresse, detailsClilent, id, nom);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Client other = (Client) obj;
	return Objects.equals(this.adresse, other.adresse) && Objects.equals(this.detailsClilent, other.detailsClilent)
		&& Objects.equals(this.id, other.id) && Objects.equals(this.nom, other.nom);
    }

}
