package com.cgi.Gestion_clients.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.Gestion_clients.dto.ClientDto;
import com.cgi.Gestion_clients.dto.DetailsEtClientDto;
import com.cgi.Gestion_clients.entity.Client;
import com.cgi.Gestion_clients.entity.DetailsClient;
import com.cgi.Gestion_clients.service.ClientService;
import com.cgi.Gestion_clients.service.DetailsService;

@RestController
@RequestMapping("clients")
public class ClientController {

    // Injecter ClientService
    @Autowired
    ClientService clientService;
    // Injecter DetailsService
    @Autowired
    DetailsService detailsService;

    @GetMapping
    public List<ClientDto> getClients() {
	return clientService.findAll().stream().map(c -> new ClientDto(c.getId(), c.getNom(), c.getAdresse()))
		.collect(Collectors.toList());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addClient(@RequestBody Client client) {
	clientService.save(client);
    }

    @DeleteMapping("{id}")
    public void deleteClient(@PathVariable("id") Integer id) {
	clientService.delete(id);
    }

    @PutMapping
    public void updateClient(@RequestBody Client client) {
	clientService.update(client);
    }

    @GetMapping("client") // http://localhost:8080/clients/client?id= ...
    public Client getClientById(@RequestParam(name = "id") Integer id) {
	return clientService.findById(id);
    }

    @GetMapping("details")
    public List<DetailsEtClientDto> getDetailsClients() {
	List<DetailsClient> listeDC = detailsService.getDetails();
	return listeDC.stream().map(dc -> new DetailsEtClientDto(dc, dc.getClient())).collect(Collectors.toList());
    }
}
