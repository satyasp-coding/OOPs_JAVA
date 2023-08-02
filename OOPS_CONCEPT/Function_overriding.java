public class Function_overriding {
    public static void main(String args[]) {
        Deer d = new Deer();
        d.eat();

        
       

    }
}

//run time polymorphism.......

class Animal {
    void eat() {
        System.out.println("eats everything");
    }
}

class Deer {
    void eat() {
        System.out.println("eats grass");
    }
}





