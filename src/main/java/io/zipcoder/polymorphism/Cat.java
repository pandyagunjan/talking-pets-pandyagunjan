package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat() {
        super();
    }
    public Cat(String name)
    {
        super(name);
    }
    @Override
    public String speak()
    {
        return "Speaking from CAT class";
    }


}
