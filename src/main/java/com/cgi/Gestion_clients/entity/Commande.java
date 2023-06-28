package com.cgi.gestion_clients.entity;

import static jakarta.persistence.CascadeType.*;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String details;
	@ManyToOne(cascade= {PERSIST, MERGE, DETACH, REFRESH})
	@JoinColumn(name = "id_client")
	@JsonIgnoreProperties
	private Client client;
	@ManyToMany
	@JoinTable(
			name="commande_prduit", // nom de la table d'association
			joinColumns = @JoinColumn(name="id_commande"),
			inverseJoinColumns = @JoinColumn(name="id_produit")	
			)
	private List<Produit> produits; 
	
	public Commande() {
		
	}

	public Commande(String details, Client client) {
		super();
		this.details = details;
		this.client = client;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public void addProduit(Produit produit) {
		if(this.produits == null) {
			this.produits = new ArrayList<Produit>();
		}
		this.produits.add(produit);
	}
}
