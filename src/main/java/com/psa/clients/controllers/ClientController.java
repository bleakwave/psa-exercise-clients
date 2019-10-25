package com.psa.clients.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.Region;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.psa.clients.dao.jpa.ClientRepository;
import com.psa.clients.dao.jpa.RegionCountRepository;
import com.psa.clients.domain.Client;
import com.psa.clients.domain.RegionCount;


@Controller

public class ClientController {
	
	@Autowired
	ClientRepository clientRepository;
	RegionCountRepository regionCountRepository;
	
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
	
	@RequestMapping("/api/v1/regions/post_count/{id}")
	public String getRegions (Model model) {
		List<Region> regions = new ArrayList<>();
//		regionCountRepository.findAll().forEach(region -> regions.add(region));
//		model.addAttribute("regions", regions);
		return "client-list";
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/api/v1/regions/post_count")
	public String getRegions (@PathVariable int id, RegionCount region) {
		regionCountRepository.save(region);
//		model.addAttribute("regions", region);
		return "region";
	}
		

}
