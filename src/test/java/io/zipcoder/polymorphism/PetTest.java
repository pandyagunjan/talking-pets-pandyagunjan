
package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.opto.MachNode;

import java.util.ArrayList;
import java.util.Date;


public class PetTest {


    @Test
    public void constructorTest() {
        // Given (pet data)
        String givenName = "";


        // When (a pet is constructed)
        Pet pet = new Pet();
        //  pet.setPetName(givenName);

        // When (we retrieve data from the pet)
        String retrievedName = pet.getPetName();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName); //

    }

    @Test
    public void setAndGetNameTest() {
        // Given (pet data)
        String givenName = "Setting this";


        // When (a pet is constructed)
        Pet pet = new Pet();
        pet.setPetName(givenName);

        // When (we retrieve data from the pet)
        String retrievedName = pet.getPetName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);

    }

    @Test
    public void speakTest() {
        // Given (pet data)
        String givenName = "Speaking from PET class";

        // When (a pet is constructed)
        Pet pet = new Pet();
        // pet.setPetName(givenName);

        // When (we retrieve data from the pet)
        // String str=pet.speak();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName , pet.speak());

    }

    @Test
    public void printTest() {
        // Given (pet data)
        String givenName1 = "Zully";
        String givenName2 = "Jigu";
        String givenName3 = "Apple";
        // When (a pet is constructed)
        Cat cat = new Cat(givenName1);
        Dog dog = new Dog(givenName2);
        Bunny bunny = new Bunny(givenName3);
        //  pet.setPetName(givenName);
        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(cat);
        pets.add(dog);
        pets.add(bunny);
        PetService petService= new PetService();
       // Integer noOfPets = petService.getNumberOfPets();
        //petService.acceptName(noOfPets);
        petService.printResults(pets);

        // Then (we expect the given data, to match the retrieved data)
       // Assert.assertEquals(givenName1 , pets.equals());

    }

}


