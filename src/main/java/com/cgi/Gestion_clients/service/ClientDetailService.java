package com.cgi.Gestion_clients.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cgi.Gestion_clients.entity.DetailsClient;
import com.cgi.Gestion_clients.repository.DetailsClientRepository;

public class ClientDetailService {

    @Autowired
    private DetailsClientRepository detailsClientRepository;

    public void createDetails(DetailsClient detailsClient) {
	detailsClientRepository.save(detailsClient);
    }

    public Optional<DetailsClient> findByDetailsClients(Integer id) {
	return detailsClientRepository.findById(id);
    }

    public void deleteDetails(Integer id) {
	detailsClientRepository.deleteById(id);
    }

    public void updateDetails(Integer id, DetailsClient detailsClient) {
	detailsClientRepository.save(detailsClient);
    }

}
