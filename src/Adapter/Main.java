package Adapter;

import Adapter.animal.Animal;
import Adapter.animal.Cat;
import Adapter.animal.Dog;
import Adapter.animal.TigerAdapter;

import java.util.ArrayList;

// 어댑터 클래스는 변경할 수 없는 클래스를 인터페이스나 클래스로 사용하고자 할때 사용.
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("댕댕이"));
        animals.add(new Cat("아깽이"));
        animals.add(new Cat("츄르"));
        // animals.add(new Tiger("백호")); 에러발생
        animals.add(new TigerAdapter("백호"));

        animals.forEach(animal -> {
            animal.sound();
        });
    }
}
