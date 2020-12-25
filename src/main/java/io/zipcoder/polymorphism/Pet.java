package io.zipcoder.polymorphism;

import java.util.Comparator;

public class Pet implements Comparable<Pet>{

    String petName = "";

    public Pet() {

    }

    public Pet(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }


    public String speak() {
        return "Speaking from PET class";
    }

//    public  Comparator<Pet> petComparator=new Comparator<Pet>()
//    {
//
//       public int compare (Pet p1, Pet p2){
//           return p1.getPetName().compareTo(p2.getPetName());
//
//          }
//
//    };


  // Comparable interface
@Override
    public int compareTo(Pet o) {

        return this.getPetName().compareTo(o.getPetName());

    }

    static class NameComparator<P> implements Comparator<Pet>
    {
        public int compare(Pet p1,Pet p2)
        {
            return p1.getPetName().compareTo(p2.getPetName());
        }
    }
}
