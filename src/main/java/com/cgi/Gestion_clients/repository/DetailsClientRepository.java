package com.cgi.Gestion_clients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.Gestion_clients.entity.DetailsClilent;

@Repository
public interface DetailsClientRepository extends JpaRepository<DetailsClilent, Integer> {

}
