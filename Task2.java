package Video9;

public class Task2 {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        try {
            plants[0] = new Plant("rose", "blue", 33);
//            plants[1] = new Plant("lilac", "white", 20);
//            plants[2] = new Plant("dracena", "yellow", 40);
//            plants[3] = new Plant("rose", "green", 25);
//            plants[4] = new Plant("fialka", "blue", 33);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        try {
            plants[3] = new Plant("rose", "green", 25);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}


class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws MyException {
        this.size = size;
        this.type = Typed(type);
        this.color = Colored(color);

    }

    public enum Color {
        white, blue, yellow
    }

    enum Type {
        rose, lilac, dracena
    }

    private static Color Colored(String color) throws MyException {
        switch (color) {
            case "white":
                return Color.white;
            case "blue":
                return Color.blue;
            case "yellow":
                return Color.yellow;

            default:
                throw new MyException("Wrong color");
        }
    }

    private static Type Typed(String type) throws MyException {
        switch (type) {
            case "rose":
                return Type.rose;
            case "lilac":
                return Type.lilac;
            case "dracena":
                return Type.dracena;

            default:
                throw new MyException("Wrong type");
        }
    }

    @Override
    public String toString() {
        return "Plant type= " + type + ", color= " + color + ", size= " + size;
    }

}

class MyException extends Exception {

    public MyException() {
    }

    public MyException(String mess) {
        super(mess);
    }
}
