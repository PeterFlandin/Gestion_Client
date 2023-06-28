package com.cgi.Gestion_clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.Gestion_clients.entity.DetailsClient;

public interface DetailsClientRepository extends JpaRepository<DetailsClient, Integer> {

}
