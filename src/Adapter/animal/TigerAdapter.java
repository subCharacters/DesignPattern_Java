package Adapter.animal;

import Adapter.animal.external.Tiger;

public class TigerAdapter extends Animal {
    private Tiger tiger;

    public TigerAdapter(String name) {
        super(name);

        tiger = new Tiger();
        tiger.setName(name);
    }

    @Override
    public void sound() {
        System.out.print(tiger.getName() + " ");
        tiger.roar();
    }
}
