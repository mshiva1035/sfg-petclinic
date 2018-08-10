package com.springframework.sivapetclinic.services;

import com.springframework.sivapetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
