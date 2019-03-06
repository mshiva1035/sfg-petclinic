package com.springframework.sivapetclinic.repositories;

import com.springframework.sivapetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
