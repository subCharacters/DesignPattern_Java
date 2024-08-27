package FactoryMethod.structure;

import FactoryMethod.impliments.Item;

public class Meat implements Item {
    @Override
    public void use() {
        System.out.println("use Meat");
    }
}
