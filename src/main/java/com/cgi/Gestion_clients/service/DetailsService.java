package com.cgi.Gestion_clients.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.Gestion_clients.entity.DetailsClient;
import com.cgi.Gestion_clients.repository.DetailsClientRepository;

@Service
public class DetailsService {

    @Autowired
    DetailsClientRepository dcRepository;

    // Récupérer tous les détails clients
    public List<DetailsClient> getDetails() {
	return dcRepository.findAll();
    }

    // Supprimer les détails sans supprimer le client associé
    public void delete(Integer id) {
	DetailsClient dc = dcRepository.findById(id).get();
	dc.setClient(null); // détacher le client des détails
	dcRepository.delete(dc);
    }

}
