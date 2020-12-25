
package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;


public class BunnyTest {


    @Test
    public void constructorTest() {
        // Given (bunny data)
        String givenName = "";


        // When (a bunny is constructed)
        Bunny bunny = new Bunny();
        //  bunny.setPetName(givenName);

        // When (we retrieve data from the bunny)
        String retrievedName = bunny.getPetName();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName); //

    }

    @Test
    public void setAndGetNameTest() {
        // Given (bunny data)
        String givenName = "Setting this";


        // When (a bunny is constructed)
        Bunny bunny = new Bunny();
        bunny.setPetName(givenName);

        // When (we retrieve data from the bunny)
        String retrievedName = bunny.getPetName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);

    }

    @Test
    public void speakTest() {
        // Given (bunny data)
        String givenName = "Speaking from BUNNY class";

        // When (a bunny is constructed)
        Bunny bunny = new Bunny();
        // bunny.setPetName(givenName);

        // When (we retrieve data from the bunny)
        // String str=bunny.speak();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName , bunny.speak());

    }

}


