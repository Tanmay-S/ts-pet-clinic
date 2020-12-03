package com.ahc.tspetclinic.services;

import com.ahc.tspetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
