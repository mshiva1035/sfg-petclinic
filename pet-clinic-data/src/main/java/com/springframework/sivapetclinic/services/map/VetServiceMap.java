package com.springframework.sivapetclinic.services.map;

import com.springframework.sivapetclinic.model.Vet;
import com.springframework.sivapetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteBydId(aLong);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
