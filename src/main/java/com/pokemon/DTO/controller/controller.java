package com.pokemon.DTO.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pokemon.DTO.dto.PokemonDTO;
import com.pokemon.DTO.entity.Pokemon;
import com.pokemon.DTO.entity.User;
import com.pokemon.DTO.repository.PokeRepo;
import com.pokemon.DTO.repository.UserRepo;
import com.pokemon.DTO.service.PokemonMapper;

@Controller
public class controller {

    @Autowired
    private UserRepo userRepo;
    
    @GetMapping("/pokeSuccesMapper")
    public ResponseEntity<?> getPokemonMapper() {
        User user = userRepo.findById(1L).get();
        List<Pokemon> pokemons = user.getPokemons();
        List<PokemonDTO> pokesDto = new ArrayList<PokemonDTO>();
        int i = 0;
        for (Pokemon pokemon: pokemons) {
            PokemonDTO pokeDto = PokemonMapper.TransformPokeEntityInPokeDto(pokemon);
            pokesDto.add(i, pokeDto);
            i++;
        }
        return new ResponseEntity<>(pokesDto, HttpStatus.OK);
        
    }
}
