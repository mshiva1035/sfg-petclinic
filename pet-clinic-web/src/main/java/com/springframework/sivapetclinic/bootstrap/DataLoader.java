package com.springframework.sivapetclinic.bootstrap;

import com.springframework.sivapetclinic.model.Owner;
import com.springframework.sivapetclinic.model.Vet;
import com.springframework.sivapetclinic.services.OwnerService;
import com.springframework.sivapetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private OwnerService ownerService;
    @Autowired
    private VetService vetService;

    public DataLoader() {

    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Michael");
        owner.setLastName("Weston");
        ownerService.save(owner);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Siva");
        owner2.setLastName("Mattapally");
        ownerService.save(owner2);

        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("Sam");
        vet.setLastName("Axz");
        vetService.save(vet);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Jazzy");
        vetService.save(vet2);

    }
}
