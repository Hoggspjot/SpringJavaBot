import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIter {
    public static void main(String[] args) {

        Animal cat = new Cat("Barsik", 1);
        cat.makeSound();

        List<Move> moving = List.of(
                new Animal("Animal", 100),
                new Cat("Boo", 3)
        );
        for (Move move : moving) {
            move.moving();
        }


    }
}


class Animal implements Move {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some noice");
    }

    @Override
    public void moving() {
        System.out.println("animal is moving");
    }
}

class Cat extends Animal implements Move {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void moving() {
        System.out.println("Cat moving");
    }
}

interface Move {
    void moving();
}