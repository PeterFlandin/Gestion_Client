package com.cgi.gestion_clients.dto;

import java.util.ArrayList;
import java.util.List;

import com.cgi.gestion_clients.entity.Produit;

public class ClientProduitsCommandesDto {
	private List<Produit> produits;

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
