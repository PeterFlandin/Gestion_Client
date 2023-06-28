package com.cgi.gestion_clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.gestion_clients.entity.DetailsClient;

@Repository 
public interface DetailsClientRepository extends JpaRepository<DetailsClient, Integer>{

}
