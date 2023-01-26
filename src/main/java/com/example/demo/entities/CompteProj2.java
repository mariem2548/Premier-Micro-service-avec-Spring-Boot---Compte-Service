package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

import com.example.demo.enums.TypeCompte;

@Projection(name="p2", types = Compte.class)
public interface CompteProj2 {
	
	 double getSolde();
	 TypeCompte getType();

}
