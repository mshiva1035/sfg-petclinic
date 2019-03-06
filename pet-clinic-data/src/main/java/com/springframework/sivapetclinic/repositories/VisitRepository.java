package com.springframework.sivapetclinic.repositories;

import com.springframework.sivapetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Vet,Long> {
}
