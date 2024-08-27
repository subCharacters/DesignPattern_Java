package FactoryMethod;

import FactoryMethod.impliments.Factory;
import FactoryMethod.impliments.Item;
import FactoryMethod.structure.ItemFactory;

public class Main {
    public static void main(String[] args) {
        Factory itemFactory = new ItemFactory();

        Item Meat1 = itemFactory.create("Meat");
        Meat1.use();
        Item Meat2 = itemFactory.create("Meat");
        Meat2.use();
        Item Meat3 = itemFactory.create("Meat");
        if (Meat3 != null) Meat3.use();
        Item Meat4 = itemFactory.create("Meat");
        if (Meat4 != null) Meat4.use();

        Item hp1 = itemFactory.create("HPPotion");
        if (hp1 != null) hp1.use();
        Item hp2 = itemFactory.create("HPPotion");
        if (hp2 != null) hp2.use();
        Item hp3 = itemFactory.create("HPPotion");
        if (hp3 != null) hp3.use();
        Item hp4 = itemFactory.create("HPPotion");
        if (hp4 != null) hp4.use();

        Item mp1 = itemFactory.create("MPPotion");
        if (mp1 != null) mp1.use();
        Item mp2 = itemFactory.create("MPPotion");
        if (mp2 != null) mp2.use();
        Item mp3 = itemFactory.create("MPPotion");
        if (mp3 != null) mp3.use();
        Item mp4 = itemFactory.create("MPPotion");
        if (mp4 != null) mp4.use();
        Item mp5 = itemFactory.create("MPPotion");
        if (mp5 != null) mp5.use();

        /***
         * use Meat
         * use Meat
         * Meat 은 한계치까지 소지 중입니다.
         * Meat 은 한계치까지 소지 중입니다.
         * use HPPotion
         * use HPPotion
         * use HPPotion
         * HPPotion 은 한계치까지 소지 중입니다.
         * use MPPotion
         * use MPPotion
         * use MPPotion
         * use MPPotion
         * MPPotion 은 한계치까지 소지 중입니다.
         */

    }
}
