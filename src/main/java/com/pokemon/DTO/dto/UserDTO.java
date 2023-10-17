package com.pokemon.DTO.dto;

import java.util.List;
import com.pokemon.DTO.entity.Pokemon;

public class UserDTO {
    private Long id;
    private String name;
    private List<Pokemon> Pokemon;

    
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemon() {
        return this.Pokemon;
    }

    public void setPokemon(List<Pokemon> Pokemon) {
        this.Pokemon = Pokemon;
    }
}
