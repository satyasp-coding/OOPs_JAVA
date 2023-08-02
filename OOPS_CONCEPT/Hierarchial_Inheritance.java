public class Hierarchial_Inheritance  {
    public static void main(String args[]) {
        // Fish shark = new Inheritance().new Fish();
        // shark.eat();
        // shark.swim();
        Bird sparrow = new Hierarchial_Inheritance().new Bird();
        sparrow.fly();
        
      

    }

    // Base class
    class Animal {
        String color;

        void eat() {
            System.out.println("eats");
        }

        void breathe() {
            System.out.println("breathes");
        }
    }

    


    class Mammals extends Animal {
        void walk() {
            System.out.println("walks");

        }
        
    }
    
    class Fish extends Animal {
        void walk() {
            System.out.println("swim");

        }
        
    }
    class Bird extends Animal {
        void fly() {
            System.out.println("fly");

        }
        
    }

    



}