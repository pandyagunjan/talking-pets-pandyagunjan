package io.zipcoder.polymorphism;

public class Dog extends Pet {

    public Dog() {
        super();
    }
    public Dog(String name)
    {
        super(name);
    }
    @Override
    public String speak()
    {
        return  "Speaking from DOG class";
    }


}
