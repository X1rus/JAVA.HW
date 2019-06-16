package Video6;

public class Task1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Dog();

        for (Animal i: animals)
        {
            System.out.println(i.feed());
            System.out.println(i.voice());
        }
    }
}

interface Animal {
    String voice();

    String feed();
}

class Cat implements Animal {

    @Override
    public String voice() {
        return "miy";
    }

    @Override
    public String feed() {
        return "KittyCat";
    }
}

class Dog implements Animal {

    @Override
    public String voice() {
        return "gav";
    }

    @Override
    public String feed() {
        return "cats";
    }
}