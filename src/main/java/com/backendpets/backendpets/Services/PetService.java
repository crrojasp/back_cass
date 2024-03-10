package com.backendpets.backendpets.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendpets.backendpets.repositories.PetRepository;

@Service
public class PetService {

    @Autowired
    PetRepository petRepository;

}