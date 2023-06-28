package com.cgi.gestion_clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.gestion_clients.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer>{

}
