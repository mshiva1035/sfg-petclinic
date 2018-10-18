package com.springframework.sivapetclinic.bootstrap;

import com.springframework.sivapetclinic.model.Owner;
import com.springframework.sivapetclinic.model.Pet;
import com.springframework.sivapetclinic.model.PetType;
import com.springframework.sivapetclinic.model.Vet;
import com.springframework.sivapetclinic.services.OwnerService;
import com.springframework.sivapetclinic.services.PetTypeService;
import com.springframework.sivapetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private OwnerService ownerService;
    @Autowired
    private VetService vetService;
    @Autowired
    private PetTypeService petTypeService;

    public DataLoader() {

    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cate");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner = new Owner();
        owner.setFirstName("Michael");
        owner.setLastName("Weston");
        owner.setAddress("123 Birasda");
        owner.setCity("Miami");
        owner.setTelephone("1321545666");
        ownerService.save(owner);

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setName("Rosco");
        mikesPet.setOwner(owner);
        mikesPet.setBirthDate(LocalDate.now());
        owner.getPets().add(mikesPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Siva");
        owner2.setLastName("Mattapally");
        owner2.setAddress("456 Birasda");
        owner2.setCity("Ohio");
        owner2.setTelephone("3242154566");
        ownerService.save(owner2);

        Pet sivasPet = new Pet();
        sivasPet.setPetType(savedCatPetType);
        sivasPet.setName("Jummu");
        sivasPet.setOwner(owner2);
        sivasPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(sivasPet);


        Vet vet = new Vet();
        vet.setFirstName("Sam");
        vet.setLastName("Axz");
        vetService.save(vet);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Jazzy");
        vetService.save(vet2);

    }
}
