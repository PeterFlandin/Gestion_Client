package com.cgi.gestion_clients.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.gestion_clients.dto.ClientProduitsCommandesDto;
import com.cgi.gestion_clients.entity.Client;
import com.cgi.gestion_clients.entity.Commande;
import com.cgi.gestion_clients.entity.Produit;
import com.cgi.gestion_clients.repository.ClientRepository;

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
	public List<Client> findAll(){
		return clientRepository.findAll();
	}

	

	public ClientProduitsCommandesDto getProduitsCommandes(Integer id) {
		List<Commande> commandes = clientRepository.findById(id).get().getCommandes();
		ClientProduitsCommandesDto produits = new ClientProduitsCommandesDto();
		for(Commande c : commandes){
			for(Produit p : c.getProduits()) {
				produits.addProduit(p);
			}
		}
		return produits;
	}
}
