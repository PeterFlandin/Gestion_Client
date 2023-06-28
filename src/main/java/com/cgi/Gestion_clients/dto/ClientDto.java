package com.cgi.Gestion_clients.dto;

public class ClientDto {

    private Integer id;
    private String nom;
    private String adresse;

    public ClientDto(Integer id, String nom, String adresse) {
	super();
	this.id = id;
	this.nom = nom;
	this.adresse = adresse;
    }

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

}
