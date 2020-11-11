package io.zipcoder.polymorphism;
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
                          Dog dog = new Dog();
                          System.out.print("Dog's Name:" );
                          petName= scanner.next();
                          dog.petName=petName;
                          pets.add(dog);
                        //  dog.speak();
                          break;

                  case 2 :
                          Cat cat = new Cat();
                          System.out.print("Cat's Name:" );
                          petName= scanner.next();
                          cat.petName=petName;
                          pets.add(cat);
                     //     cat.speak();
                          break;
                  case 3 :
                          Bunny bunny = new Bunny();
                          System.out.print("Bunny's Name:" );
                          petName= scanner.next();
                          bunny.petName=petName;
                          pets.add(bunny);
                        //  bunny.speak();
                          break;

              }


            //  System.out.println(pets.toString());
          }

        for (Pet p: pets)
        {
            System.out.println("Pet's Name :" + String.valueOf(p.getPetName()));
            p.speak();
        }


    }

}
