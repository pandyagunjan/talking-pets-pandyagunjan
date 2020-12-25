package io.zipcoder.polymorphism;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

public class MainApplication {


    public static void main(String[] args) {
        PetService petService= new PetService();
        Integer noOfPets = petService.getNumberOfPets();
        petService.acceptName(noOfPets);
        petService.printResults(petService.pets);

    }


}
