public class Inheritance {
    public static void main(String args[]) {
        // Fish shark = new Inheritance().new Fish();
        // shark.eat();
        // shark.swim();
        Dog dobby = new Inheritance().new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

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

    // Derived class (Fish) is defined outside of Animal class
    // class Fish extends Animal {
    //     int fins;

    //     void swim() {
    //         System.out.println("swims in water");
    //     }
    // }


    class Mammals extends Animal {
        int legs;
    }

    class Dog extends Mammals {
        String breed;
    }



}