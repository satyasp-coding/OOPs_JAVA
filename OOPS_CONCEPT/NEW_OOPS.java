public class NEW_OOPS {
    public static void main(String args[]) {
        Student s1 = new Student("satya");
        Student s2 = new Student();
        Student s3 = new Student(123);
        
        System.out.println(s1.name);
        System.out.println(s3.roll);
    }

    static class Student {
        String name;
        int roll;
        String password;

        Student(String name) { // Constructor all  things..................
            this.name = name;
           
        }

        Student() {
        System.out.println("constructer is called");
        }
        Student(int roll) {
            this.roll = roll;
        }
    }
}
