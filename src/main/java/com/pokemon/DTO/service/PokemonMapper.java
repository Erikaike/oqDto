package com.pokemon.DTO.service;

import org.springframework.stereotype.Service;

import com.pokemon.DTO.dto.PokemonDTO;
import com.pokemon.DTO.entity.Pokemon;

@Service
public class PokemonMapper {
    public static PokemonDTO TransformPokeEntityInPokeDto(Pokemon poke) {
        PokemonDTO pokeDto = new PokemonDTO();
        pokeDto.setId(poke.getId());
        pokeDto.setName(poke.getName());
        pokeDto.setAttribute(poke.getAttribute());

        return pokeDto;
        
    }

    public Pokemon TransformPokeDtoInPokeEntity(PokemonDTO pokeDto) {
        Pokemon poke = new Pokemon();
        poke.setId(poke.getId());
        poke.setName(poke.getName());
        poke.setAttribute(poke.getAttribute());

        return poke;
    }
}
