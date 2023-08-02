public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student("satya");
        System.out.println(s1.name);





            // BankAccount myAcc = new BankAccount();//object
            // myAcc.username ="satya";
            // myAcc.setPassword ("satya@123");
    }  


        // class BankAccount {

        //     public String username;
        //     private String password;
        //     //function 
        //     public void setPassword(String pwd) {
        //         password = pwd;
        //     }

        class Student {
            String name;
            int roll;


            Student(String name) {         //constructer
                this.name = name;
                //System.out.println();
            }
        }

}