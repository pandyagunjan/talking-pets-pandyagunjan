
package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

}


