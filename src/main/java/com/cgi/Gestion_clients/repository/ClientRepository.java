package com.cgi.gestion_clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.gestion_clients.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
