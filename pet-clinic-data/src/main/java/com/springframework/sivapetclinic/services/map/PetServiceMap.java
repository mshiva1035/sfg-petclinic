package com.springframework.sivapetclinic.services.map;

import com.springframework.sivapetclinic.model.Pet;
import com.springframework.sivapetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteBydId(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
