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
       String passNewLine="";
        for(int i =0 ; i <noOfPetsCount ;i++) {
            System.out.print("\nWhat kind of pet you have ? 1.Dog  2.Cat 3.Bunny :" );
            petType = scanner.nextInt();
            passNewLine=scanner.nextLine();


            switch(petType)
            {
                case 1 :
                    System.out.print("Dog's Name:" );
                    petName = scanner.nextLine();
                    Dog dog = new Dog(petName);
                    this.pets.add(dog);
                    break;

                case 2 :

                    System.out.print("Cat's Name:" );
                    petName= scanner.nextLine();
                    Cat cat = new Cat(petName);
                    this.pets.add(cat);
                    //  cat.speak();
                    break;
                case 3 :

                    System.out.print("Bunny's Name:" );
                    petName= scanner.nextLine();
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

       //
        Pet petClass = new Pet();


        System.out.println("\n============ Display Using Comparator ============");
        Pet.NameComparator<Pet> comparatorForName =  new Pet.NameComparator<Pet>();

        Collections.sort(petsPassed,comparatorForName);
        for (Pet p: petsPassed)
        {
            System.out.println("\nPet's Name :" + String.valueOf(p.getPetName()));
            System.out.print(p.speak()+"\n");
        }




        System.out.println("\n ============ Display Using Comparable Interface ============");
        Collections.sort(petsPassed);  // For Comparable
        for (Pet p: petsPassed)
        {
            System.out.println("\nPet's Name :" + String.valueOf(p.getPetName()));
            System.out.print(p.speak()+"\n");
        }


    }




}



