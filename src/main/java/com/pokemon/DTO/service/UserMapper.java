package com.pokemon.DTO.service;

import org.springframework.stereotype.Service;

import com.pokemon.DTO.dto.UserDTO;
import com.pokemon.DTO.entity.User;

@Service
public class UserMapper {
    public UserDTO TransfomUserEntityInUserDto(User user) {
        UserDTO userDto = new UserDTO();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        userDto.setPokemon(user.getPokemons());

        return userDto;
    }

    public User TransformUserDtoInUserEntity(UserDTO userDto) {
        User user = new User();
        user.setId(userDto.getId());
        userDto.setName(userDto.getName());
        userDto.setPokemon(userDto.getPokemon());

        return user;
    }
    
}
