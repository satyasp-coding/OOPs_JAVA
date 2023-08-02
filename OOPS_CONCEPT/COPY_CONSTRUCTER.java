public class COPY_CONSTRUCTER {
    public static void main(String args[]) {
        Student s1 = new Student("satya");
        s1.name = "satya";
        s1.roll = 123;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        //suppose this student forgot his password then we have to create another object
        //having same property
        Student s2 = new Student(s1);
        s1.password ="xyz";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);

        }


        
        
        
        
       
    }

    static class Student {
        String name;
        int roll;
        String password;
        int marks[];

        Student(Student s1) { //copy constructor..........
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            this.marks = s1.marks;


        }

        Student(String name) { 
            marks = new int[3];
            this.name = name;
           
        }

      
        
        Student(int roll) {
        marks = new int[3];
        this.roll = roll;
        }
    }
}
