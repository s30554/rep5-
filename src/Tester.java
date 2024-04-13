import java.util.ArrayList;

public class Tester extends Employee{
    public ArrayList<String> Number_Of_Test = new ArrayList<>();
    public Tester(String fname, String lname, string adress, String email, String pessel, int year) {
        super(fname, lname, adress, email, pessel,year);
    }

    public void addTestType(String s)
    {
        this.Number_Of_Test.add(s);
    }

    @Override
    public int calculateSalary()
    {
        int Sallary =0;
        Sallary = super.calculateSalary()+(this.Number_Of_Test.size()*300);
        return Sallary;
    }
}
