abstract class Vegetable {
    private String color; 

    public Vegetable(String color) {
        this.color = color;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return getName() + " (Color: " + color + ")";
    }
}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Potato";
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Brinjal";
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Tomato";
    }
}

public class Vegetables{
    public static void main(String[] args) {
        
        Vegetable potato = new Potato("Brown");
        Vegetable brinjal = new Brinjal("Purple");
        Vegetable tomato = new Tomato("Red");

        System.out.println(potato); 
        System.out.println(brinjal); 
        System.out.println(tomato); 
    }
}