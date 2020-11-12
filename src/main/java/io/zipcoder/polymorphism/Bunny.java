package io.zipcoder.polymorphism;

public class Bunny extends Pet{

    public Bunny() {
        super();
    }
    public Bunny(String name)
    {
        super(name);
    }
    @Override
    public String speak()
    {
        return "Speaking from BUNNY class";
    }


}
