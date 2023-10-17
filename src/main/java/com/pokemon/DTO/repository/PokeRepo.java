package com.pokemon.DTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pokemon.DTO.entity.Pokemon;

@Repository
public interface PokeRepo extends JpaRepository<Pokemon, Long> {
    
}
