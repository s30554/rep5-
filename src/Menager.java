import java.util.ArrayList;

public class Manager extends Employee{
    ArrayList<Boolean> Goals = new ArrayList<>();
    ArrayList<Integer> bonus = new ArrayList<>();
    public Manager(String fname, String lname, String adress, String email, String pessel,int year) {
        super(fname, lname, adress, email, pessel, year);
    }
    public void addGoals(Goal goal)
    {
        System.out.println(goal.made);
        this.Goals.add(goal.made);
        this.bonus.add(goal.bonus);
    }
    public int calculateSalary()
    {
        int Sallary =0;
        for (int i = 0; this.Goals.size() > i; i++)
        {
            if(Goals.get(i))
            {
                System.out.println("true");
                Sallary +=this.bonus.get(i);
            }


        }
        Sallary += super.calculateSalary();
        return Sallary;
    }
}
