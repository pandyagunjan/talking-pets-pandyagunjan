package io.zipcoder.polymorphism;

public class Pet {

    String petName = "" ;

    public Pet() {

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


}
