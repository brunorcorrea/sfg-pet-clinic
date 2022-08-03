package xyz.brunocorrea.sfgpetclinic.services;

import xyz.brunocorrea.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
