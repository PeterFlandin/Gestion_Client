package com.cgi.Gestion_clients.entity;

import java.util.List;
import java.util.Objects;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private String libelle;
    @Column(nullable = false)
    private Double prix;
    @ManyToMany
    @JoinTable(name = "commande_produit", joinColumns = @JoinColumn(name = "id_produit"), inverseJoinColumns = @JoinColumn(name = "id_commande"))
    private List<Commande> commandes;

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getLibelle() {
	return this.libelle;
    }

    public void setLibelle(String libelle) {
	this.libelle = libelle;
    }

    public Double getPrix() {
	return this.prix;
    }

    public void setPrix(Double prix) {
	this.prix = prix;
    }

    public List<Commande> getCommandes() {
	return this.commandes;
    }

    public void setCommandes(List<Commande> commandes) {
	this.commandes = commandes;
    }

    public Produit() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Produit(String libelle, Double prix, List<Commande> commandes) {
	super();
	this.libelle = libelle;
	this.prix = prix;
	this.commandes = commandes;
    }

    @Override
    public int hashCode() {
	return Objects.hash(commandes, id, libelle, prix);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Produit other = (Produit) obj;
	return Objects.equals(this.commandes, other.commandes) && Objects.equals(this.id, other.id)
		&& Objects.equals(this.libelle, other.libelle) && Objects.equals(this.prix, other.prix);
    }

    @Override
    public String toString() {
	return "Produit [id=" + this.id + ", libelle=" + this.libelle + ", prix=" + this.prix + ", commandes="
		+ this.commandes + "]";
    }

}
