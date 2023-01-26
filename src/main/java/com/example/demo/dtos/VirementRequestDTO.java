package com.example.demo.dtos;

import lombok.Data;

@Data
public class VirementRequestDTO {
	private Long codeSource;
	private Long codeDestination;
	private double montant;

}
