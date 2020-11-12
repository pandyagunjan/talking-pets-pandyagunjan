package io.zipcoder.polymorphism;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

public class MainApplication {




    public static void main(String[] args) {
        Integer noOfPets = 0;
        ArrayList<Pet> pets = new ArrayList<Pet>();
        String petName="";


        System.out.print("How many pets you have ? ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            noOfPets = scanner.nextInt();
           }

          int petType=0;

          for(int i =0 ; i <noOfPets ;i++) {
              System.out.print("What kind of pet you have ? 1.Dog  2.Cat 3.Bunny : " );
              petType = scanner.nextInt();


              switch(petType)
              {
                  case 1 :

                          System.out.print("Dog's Name:" );
                          petName = scanner.next();
                          Dog dog = new Dog(petName);
                          pets.add(dog);
                         // System.out.print(dog.speak());
                          break;

                  case 2 :

                          System.out.print("Cat's Name:" );
                          petName= scanner.next();
                          Cat cat = new Cat(petName);
                          pets.add(cat);
                        //  cat.speak();
                          break;
                  case 3 :

                          System.out.print("Bunny's Name:" );
                          petName= scanner.next();
                          Bunny bunny = new Bunny();
                          bunny.petName=petName;
                          pets.add(bunny);
                        //  bunny.speak();
                          break;
                  default :
                      System.out.print("Program Ending.....");
                      System.exit(0);
                      break;
              }


          }

       MainApplication ma= new MainApplication();
       ma.printResults(pets);


    }

    public void printResults(ArrayList<Pet> petsPassed){

     // Collections.sort(petsPassed);  // For Comparable

       Collections.sort(petsPassed,Pet.petComparator);
        for (Pet p: petsPassed)
        {
            System.out.println("\nPet's Name :" + String.valueOf(p.getPetName()));
            System.out.print(p.speak()+"\n");
        }
    }


}
