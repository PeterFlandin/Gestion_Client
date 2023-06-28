package com.cgi.gestion_clients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionClientsApplication{
//	@Autowired
//	ClientRepository clientRepository;
//	
//	@Autowired
//	DetailsClientRepository dcRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestionClientsApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// Créer des détails clients
//		DetailsClient dc = new DetailsClient("a@gmail.com", 11111111);
//		dcRepository.save(dc);
//		// Créer des clients
//		Client c = new Client("a", "adresse a", dc);
//		clientRepository.save(c);
//		
//		// Afficher les clients		
//		clientRepository.findAll().stream().forEach(client -> System.out.println(client));
//		
//	}

}
