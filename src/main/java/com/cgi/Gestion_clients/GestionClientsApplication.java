package com.cgi.Gestion_clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cgi.Gestion_clients.entity.Client;
import com.cgi.Gestion_clients.entity.DetailsClilent;
import com.cgi.Gestion_clients.repository.ClientRepository;
import com.cgi.Gestion_clients.repository.DetailsClientRepository;

@SpringBootApplication
public class GestionClientsApplication {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private DetailsClientRepository detailsClientRepository;

    public static void main(String[] args) {
	SpringApplication.run(GestionClientsApplication.class, args);
    }

    public void run(String[] args) throws Exception {
	DetailsClilent dc = new DetailsClilent("a@gmail.com", 123456);

	detailsClientRepository.save(dc);

	Client client = new Client("blabla", "maison", dc);
	clientRepository.save(client);

	clientRepository.findAll().stream().forEach(e -> System.out.println(client));

    }

}
