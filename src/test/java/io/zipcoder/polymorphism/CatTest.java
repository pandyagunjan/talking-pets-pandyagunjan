package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class CatTest {


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "";


        // When (a cat is constructed)
        Cat cat = new Cat();
      //  cat.setPetName(givenName);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getPetName();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName); //

    }

    @Test
    public void setAndGetNameTest() {
        // Given (cat data)
        String givenName = "Setting this";


        // When (a cat is constructed)
         Cat cat = new Cat();
         cat.setPetName(givenName);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getPetName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);

    }

    @Test
    public void speakTest() {
        // Given (cat data)
        String givenName = "Speaking from CAT class";

        // When (a cat is constructed)
       Cat cat = new Cat();
       // dog.setPetName(givenName);

        // When (we retrieve data from the cat)
       // String str=dog.speak();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName , cat.speak());

    }

}
