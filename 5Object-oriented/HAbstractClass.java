// 抽象类，抽象方法，不实现具体语句，只为(强迫)子类能重写
public class HAbstractClass {
    public static void main(String[] argcs) {
        Animal[] nonHuman = new Animal[] {
            new Sheep(),
            new Lion(),
            new Laoba()
        };
        getSay(nonHuman);
    }

    public static void getSay(Animal... animals) {
        for (Animal animal:animals) {
            animal.eat();
        }
    }

}

abstract class Animal {
    public abstract void eat();
}

class Sheep extends Animal {
    @Override
    public void eat() {
        System.out.println("I'm a sheep, I like grass!!");
    }
}

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("I'm a lion, I like meet!!");
    }
}

class Laoba extends Animal {
    @Override
    public void eat() {
        System.out.println("My name is laoba, I like Hamburger.");
    }
}