package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entities.Compte;
import com.example.demo.enums.TypeCompte;
@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long>{
  @RestResource(path="/byType")
  List<Compte> findByType(@Param(value="type") TypeCompte typeCompte);
}
