import java.util.Scanner;

public class HelloWorld {
    // ctor
    public HelloWorld(){
    }
    // instance method 1
    public void usecase1(){
    }
    // instance method 2
    public void usecase2(){
    }

    // main entry point: static method
    public static void main(String args[])
    {
        System.out.println("Please enter the amount of babies you have: ");


         Scanner reader = new Scanner(System.in);
         int userBaby;
         userBaby = reader.nextInt();


        Person man = new Person("Daniel", "Kim");

        FamilyMan father = new FamilyMan("Daniel", "Kim", userBaby);


        //Still works because FamilyMan is the child class of Person
        //Person inherit = new FamilyMan("Daniel", "Kim", 0 )

        if(userBaby == 0 ){
            System.out.println(man.getName());
        }

       else if(userBaby > 0){
            System.out.println(father.getName() + ", " + father.getNumOfBabies());
        }

       else(userBaby != (int)userBaby){
            System.out.println("You entered an invalid amount. Please reopen the program and enter a valid amount");
        }


    }
}
