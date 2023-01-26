package com.example.demo.entities;

import java.util.Date;

import com.example.demo.enums.TypeCompte;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor  @AllArgsConstructor 
public class Compte {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;
	private double solde;
	private Date dateCreation;
	@Enumerated(EnumType.STRING)
	private TypeCompte type;
}
