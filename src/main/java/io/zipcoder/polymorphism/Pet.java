package io.zipcoder.polymorphism;

public class Pet implements Comparable<Pet>{

    String petName = "" ;

    public Pet() {

    }
    public Pet(String petName)
    {
        this.petName=petName;
    }
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }


    public String speak()
    {
        return "Speaking from PET class";
    }

@Override
    public int compareTo(Pet o) {

        return this.getPetName().compareTo(o.getPetName());
      /*  if(this.getPetName().equals(o.getPetName()))
            return 0;
        else if()
          {
              return -1;
          }
          else
              return 1;*/

    }
}
