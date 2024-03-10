package com.backendpets.backendpets.Models;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.UUID;
import java.util.List;

@Entity
@Table("pets")
public class PetModel {

    @PrimaryKey
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idPets;

    private int age;
    private String description;
    private String especie;
    private boolean gender;
    private String idFoundation;
    private String name;
    private String race;
    private String status;
    private List<String> images;

    // Getters and Setters
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public boolean isGender() {
        return gender;
    }
    
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
    public String getId_foundation() {
        return idFoundation;
    }
    
    public void setId_foundation(String id_foundation) {
        this.idFoundation = id_foundation;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getRace() {
        return race;
    }
    
    public void setRace(String race) {
        this.race = race;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

}