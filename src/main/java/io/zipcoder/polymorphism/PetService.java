package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PetService {

    ArrayList<Pet> pets = new ArrayList<Pet>();
    String petName="";
    Scanner scanner = new Scanner(System.in);


    public Integer getNumberOfPets()
    {
        Integer noOfPetsAccepted = 0;
        System.out.print("How many pets you have ? ");
        if (scanner.hasNextInt()) {
            noOfPetsAccepted = scanner.nextInt();
        }
        return noOfPetsAccepted;

    }

    public void acceptName(Integer noOfPetsCount)
    {
       int petType=0;

        for(int i =0 ; i <noOfPetsCount ;i++) {
            System.out.print("What kind of pet you have ? 1.Dog  2.Cat 3.Bunny : " );
            petType = scanner.nextInt();


            switch(petType)
            {
                case 1 :
                    System.out.print("Dog's Name:" );
                    petName = scanner.next();
                    Dog dog = new Dog(petName);
                    this.pets.add(dog);
                    break;

                case 2 :

                    System.out.print("Cat's Name:" );
                    petName= scanner.next();
                    Cat cat = new Cat(petName);
                    this.pets.add(cat);
                    //  cat.speak();
                    break;
                case 3 :

                    System.out.print("Bunny's Name:" );
                    petName= scanner.next();
                    Bunny bunny = new Bunny();
                    bunny.petName=petName;
                    this.pets.add(bunny);
                    //  bunny.speak();
                    break;
                default :
                    System.out.print("Program Ending.....");
                    System.exit(0);
                    break;
            }

        }

    }
    public void printResults(ArrayList<Pet> petsPassed){

        // Collections.sort(petsPassed);  // For Comparable
        Pet petClass = new Pet();
        Collections.sort(petsPassed,petClass.petComparator);
        for (Pet p: petsPassed)
        {
            System.out.println("\nPet's Name :" + String.valueOf(p.getPetName()));
            System.out.print(p.speak()+"\n");
        }
    }


}



