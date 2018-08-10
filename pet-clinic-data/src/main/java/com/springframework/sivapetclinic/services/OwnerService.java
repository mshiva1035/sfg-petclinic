package com.springframework.sivapetclinic.services;

import com.springframework.sivapetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findByLastName(String lastName);
}
