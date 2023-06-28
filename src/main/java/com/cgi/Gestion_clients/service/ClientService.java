package com.cgi.Gestion_clients.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.Gestion_clients.entity.Client;
import com.cgi.Gestion_clients.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    // méthode pour sauvegarder un client
    public void save(Client client) {
	clientRepository.save(client);
    }

    // méthode pour supprimer un client
    public void delete(Integer id) {
	clientRepository.deleteById(id);
    }

    // méthode pour modifier un client
    public void update(Client client) {
	clientRepository.save(client);
    }

    // méthode pour lire un client par id
    public Client findById(Integer id) {
	return clientRepository.findById(id).get();
    }

    // méthode pour lire tous les clients
    public List<Client> findAll() {
	return clientRepository.findAll();
    }
}
