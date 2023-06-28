package com.cgi.gestion_clients.dto;

import com.cgi.gestion_clients.entity.Client;
import com.cgi.gestion_clients.entity.DetailsClient;

public class DetailsEtClientDto {
	
	private DetailsClient detailsClient;
	private Client client;
	public DetailsEtClientDto(DetailsClient detailsClient, Client client) {
		super();
		this.detailsClient = detailsClient;
		this.client = client;
	}
	public DetailsClient getDetailsClient() {
		return detailsClient;
	}
	public void setDetailsClient(DetailsClient detailsClient) {
		this.detailsClient = detailsClient;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

}
