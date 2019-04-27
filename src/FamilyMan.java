
public class FamilyMan extends Person{

    //Another instance variable only for this subclass
    int numOfBaby;

    public FamilyMan(String fName, String lName)
    {
        //Super class is Parent Class; Sub is child class
     super(fName, lName);
    }

    public FamilyMan(String fName, String lName, int babies)
    {
        //Super class is Parent Class; Sub is child class
        super(fName, lName);
        numOfBaby = babies;
    }

    public int getNumOfBabies()
    {
        return numOfBaby;
    }
}
