package com.cgi.Gestion_clients.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_details_client")
    @JsonManagedReference
    private DetailsClient detailsClient;
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    public Client() {

    }

    public Client(String nom, String adresse, DetailsClient detailsClient) {
	super();
	this.nom = nom;
	this.adresse = adresse;
	this.detailsClient = detailsClient;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getNom() {
	return nom;
    }

    public void setNom(String nom) {
	this.nom = nom;
    }

    public String getAdresse() {
	return adresse;
    }

    public void setAdresse(String adresse) {
	this.adresse = adresse;
    }

    public DetailsClient getDetailsClient() {
	return detailsClient;
    }

    public void setDetailsClient(DetailsClient detailsClient) {
	this.detailsClient = detailsClient;
    }

    public List<Commande> getCommandes() {
	return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
	this.commandes = commandes;
    }

    public void addCommande(Commande commande) {
	if (this.commandes == null) {
	    this.commandes = new ArrayList<Commande>();
	}
	this.commandes.add(commande);
    }

    @Override
    public int hashCode() {
	return Objects.hash(adresse, detailsClient, id, nom);
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
	return Objects.equals(adresse, other.adresse) && Objects.equals(detailsClient, other.detailsClient)
		&& Objects.equals(id, other.id) && Objects.equals(nom, other.nom);
    }

    @Override
    public String toString() {
	return "Client [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", detailsClient=" + detailsClient + "]";
    }

}
