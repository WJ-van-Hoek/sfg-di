/**
 * 
 */
package com.springframework.pets;

/**
 * @author Hoek0024 on 16 feb. 2023
 *
 */
public class PetServiceFactory {
	
	public PetService getPetService(String petType) {
		switch (petType) {
		case "dog":
			return new DogPetService();
		case "cat":
			return new CatPetService();
		default:
			return new DogPetService();
		}
	}

}
