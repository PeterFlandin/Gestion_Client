package com.cgi.Gestion_clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.Gestion_clients.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
