public class Abstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        // Chiken C = new Chiken();
        // C.eat();
        // C.walk();


    }
}


abstract class Animal {
    String color;
    Animal() {
        color = "brown";

    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();   // abstract method but..there is no implimentation

}

class Horse extends Animal {
    void changeColor() {
        color = "dark brown";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Chiken extends Animal {
    void changeColor() {
        color = "Yellow";
    }
    

    
    void walk(){
        System.out.println("walk on 2 legs");
    }
}