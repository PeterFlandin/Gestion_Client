package com.cgi.Gestion_clients.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.Gestion_clients.entity.DetailsClient;
import com.cgi.Gestion_clients.service.ClientDetailService;

@RestController
@RequestMapping("client/{id}")
public class ClientDetailController {

    @Autowired
    ClientDetailService clientDetailService;

    @PostMapping
    public void addDetail(DetailsClient detailsClient) {
	clientDetailService.createDetails(detailsClient);
    }

}
