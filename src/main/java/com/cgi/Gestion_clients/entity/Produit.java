package com.cgi.gestion_clients.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false)
	private String libelle;
	@Column(nullable = false)
	private Double prix;
	@ManyToMany
	@JoinTable(
			name="commande_prduit", // nom de la table d'association
			joinColumns = @JoinColumn(name="id_produit"),
			inverseJoinColumns = @JoinColumn(name="id_commande")	
			)
	@JsonIgnore
	private List<Commande> commandes;
	
	public Produit() {
	}

	public Produit(String libelle, Double prix, List<Commande> commandes) {
		super();
		this.libelle = libelle;
		this.prix = prix;
		this.commandes = commandes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
	
}
