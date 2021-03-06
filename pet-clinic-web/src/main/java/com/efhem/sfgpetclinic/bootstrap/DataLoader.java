package com.efhem.sfgpetclinic.bootstrap;

import com.efhem.sfgpetclinic.model.Owner;
import com.efhem.sfgpetclinic.model.Vet;
import com.efhem.sfgpetclinic.services.OwnerService;
import com.efhem.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Fiona");
        owner1.setLastName("Gienna");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Micheal");
        owner2.setLastName("Weston");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vetService.save(vet2);
    }
}
