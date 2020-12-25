
package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;


public class DogTest {
    

        @Test
        public void constructorTest() {
            // Given (dog data)
            String givenName = "";


            // When (a dog is constructed)
            Dog dog = new Dog();
            //  dog.setPetName(givenName);

            // When (we retrieve data from the dog)
            String retrievedName = dog.getPetName();


            // Then (we expect the given data, to match the retrieved data)
            Assert.assertEquals(givenName, retrievedName); //

        }

        @Test
        public void setAndGetNameTest() {
            // Given (dog data)
            String givenName = "Setting this";


            // When (a dog is constructed)
            Dog dog = new Dog();
            dog.setPetName(givenName);

            // When (we retrieve data from the dog)
            String retrievedName = dog.getPetName();

            // Then (we expect the given data, to match the retrieved data)
            Assert.assertEquals(givenName, retrievedName);

        }

        @Test
        public void speakTest() {
            // Given (dog data)
            String givenName = "Speaking from DOG class";

            // When (a dog is constructed)
            Dog dog = new Dog();
            // dog.setPetName(givenName);

            // When (we retrieve data from the dog)
            // String str=dog.speak();
            // Then (we expect the given data, to match the retrieved data)
            Assert.assertEquals(givenName , dog.speak());

        }

    }


