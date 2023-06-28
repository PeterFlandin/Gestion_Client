package com.cgi.gestion_clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.gestion_clients.entity.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Integer>{

}
