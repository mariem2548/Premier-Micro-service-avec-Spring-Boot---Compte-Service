package com.example.demo;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.entities.Compte;
import com.example.demo.enums.TypeCompte;
import com.example.demo.repositories.CompteRepository;

@SpringBootApplication
public class CompteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompteServiceApplication.class, args);
	}
	
	
	
	@Bean
	CommandLineRunner start (CompteRepository compteRepository, RepositoryRestConfiguration restConfiguration) {
		return args -> {
			restConfiguration.exposeIdsFor(Compte.class); 
			compteRepository.save(new Compte(null, 98000, new Date(),TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 12000, new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 21500, new Date(), TypeCompte.COURANT));
		   compteRepository.findAll().forEach(cp ->{
			   System.out.println(cp.getType());
			   System.out.println(cp.getSolde());
		   });
		};
	}

}
