package FactoryMethod.structure;

import FactoryMethod.data.ItemData;
import FactoryMethod.impliments.Factory;
import FactoryMethod.impliments.Item;

import java.util.HashMap;

public class ItemFactory extends Factory {
    HashMap<String, ItemData> repository;

    public ItemFactory() {
        repository = new HashMap<>();

        repository.put("Meat", new ItemData(2));
        repository.put("HPPotion", new ItemData(3));
        repository.put("MPPotion", new ItemData(4));
    }

    @Override
    public boolean isCreatable(String name) {
        ItemData itemData = repository.get(name);
        if (itemData == null) {
            System.out.println(name + " 은 존재 하지 않습니다.");
            return false;
        }

        if (itemData.currentItemCount >= itemData.maxItemCount) {
            System.out.println(name + " 은 한계치까지 소지 중입니다.");
            return false;
        }

        return true;
    }

    @Override
    public Item createItem(String name) {
        Item item = null;
        if ("Meat".equals(name)) item = new Meat();
        else if ("HPPotion".equals(name)) item = new HPPotion();
        else if ("MPPotion".equals(name)) item = new MPPotion();

        return item;
    }

    @Override
    public void postprocess(String name) {
        ItemData itemData = repository.get(name);
        if (itemData != null) itemData.currentItemCount++;
    }
}
