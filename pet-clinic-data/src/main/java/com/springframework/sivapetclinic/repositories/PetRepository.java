package com.springframework.sivapetclinic.repositories;

import com.springframework.sivapetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long>  {
}
