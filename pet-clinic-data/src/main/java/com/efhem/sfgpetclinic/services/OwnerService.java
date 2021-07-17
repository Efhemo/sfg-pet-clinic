package com.efhem.sfgpetclinic.services;

import com.efhem.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
