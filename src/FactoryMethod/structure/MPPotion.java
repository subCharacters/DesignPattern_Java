package FactoryMethod.structure;

import FactoryMethod.impliments.Item;

public class MPPotion implements Item {
    @Override
    public void use() {
        System.out.println("use MPPotion");
    }
}
