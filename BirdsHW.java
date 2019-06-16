package Video6;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BirdsHW {
    public static void main(String[] args) {
        Bird[] arrBirds=new Bird[4];
        arrBirds[0]=new Eagle();
        arrBirds[1]=new Swallow();
        arrBirds[2]=new Penguin();
        arrBirds[3]=new Chicken();
        for (Bird i : arrBirds) {
            System.out.println(i.Fly()+"\tFeathers: "+i.Feathers+"\tlay eggs: "+i.layEggs);

        }

    }
}

 abstract class Bird {

     boolean Feathers=true;
     boolean layEggs=true;

    String Fly() {

        return "Fly";
    }
}

class FlyingBird extends Bird {

    @Override
    String Fly() {
        return super.Fly();
    }
}

class NonFlyingBird extends Bird {
    @Override
    String Fly() {
        return "Not fly";
    }
}

class Eagle extends FlyingBird {


    @Override
    String Fly() {
        return "Eagle "+super.Fly();
    }
}

class Swallow extends FlyingBird {
    @Override
    String Fly() {
        return "Swallow "+super.Fly();
    }
}

class Penguin extends NonFlyingBird {

    @Override
    String Fly() {
        return "Penguin "+super.Fly();
    }
}

class Chicken extends NonFlyingBird {

    @Override
    String Fly() {
        return "Chicken "+super.Fly();
    }
}
