package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.VirementRequestDTO;
import com.example.demo.service.CompteService;
@RestController
public class AccountRestController {
	
	@Autowired
	private CompteService compteService;
	
	@PutMapping(path= "/comptes/virement")
	public void virement(@RequestBody VirementRequestDTO request) {
		compteService.virement(request.getCodeSource(), request.getCodeDestination(), request.getMontant());
	}

}
