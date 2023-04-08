package com.springframework.pets;

//@Service
//@Profile("cat")
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats are the Best";
    }
}
