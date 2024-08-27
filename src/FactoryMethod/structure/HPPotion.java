package FactoryMethod.structure;

import FactoryMethod.impliments.Item;

public class HPPotion implements Item {
    @Override
    public void use() {
        System.out.println("use HPPotion");
    }
}
