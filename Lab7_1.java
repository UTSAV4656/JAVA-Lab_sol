abstract class Vegitable {
    String name;
    String color;
}

class Potato extends Vegitable {
    public Potato(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String toString() {
        return name + "  " + color;
    }
}

class Brinjal extends Vegitable {
    public Brinjal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String toString() {
        return name + "  " + color;
    }
}

class Tomato extends Vegitable {
    public Tomato(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String toString() {
        return name + "  " + color;
    }
}

public class Lab7_1 {
    public static void main(String[] args) {
        System.out.println("------------------Potato---------------------");
        Potato p1 = new Potato("Potato", "Skin");
        System.out.println(p1);
        System.out.println("------------------Brinjal---------------------");
        Brinjal b1 = new Brinjal("Brinjal", "Purple");
        System.out.println(b1);
        System.out.println("------------------Tomato---------------------");
        Tomato t1 = new Tomato("Tomato", "Red");
        System.out.println(t1);
    }
}