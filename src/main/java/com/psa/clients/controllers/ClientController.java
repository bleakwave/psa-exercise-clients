package com.psa.clients.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psa.clients.dao.jpa.ClientRepository;
import com.psa.clients.domain.Client;


@Controller

public class ClientController {
	
	@Autowired
	ClientRepository clientRepository;
	
	@RequestMapping("/clients")
	public String getClients (Model model) {
		List<Client> clients = new ArrayList<>();
		clientRepository.findAll().forEach(client -> clients.add(client));
		model.addAttribute("clients", clients);
		return "client-list";
	}
	
	@RequestMapping("/clients/{id}")
	public String getClients (@PathVariable int id, Model model) {
		Client client = clientRepository.findById(id).orElse(null);
		model.addAttribute("clients", client);
		return "client";
	}
	
	
	

}
