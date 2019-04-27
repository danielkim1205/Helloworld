public class Person {

    //Instance variables
     String firstName;
     String lastName;

    //Constructor: Called when this class is instantiated
    public Person(String fName, String lName)
    {
        firstName = fName;
        lastName = lName;
    }

    public Person(String fName)
    {
        firstName = fName;
        lastName = "Stone";
    }

    //default constructor
    public Person()
    {
    }

    //Method: Called as needed
    public String getName()
    {
        return lastName + ", " + firstName;
    }
}
