package com.backendpets.backendpets.repositories;

import org.hibernate.type.descriptor.java.UUIDJavaType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backendpets.backendpets.Models.PetModel;

@Repository
public interface PetRepository extends CrudRepository<PetModel, UUIDJavaType> {
    
}
