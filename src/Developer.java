import java.util.List;
class Developer extends Employee {
    ArrayList<String> technology = new ArrayList<>();
    public int Sum ;
    public Developer( String fname, String lname, String adress, String email, String pessel, int year) {
        super(fname, lname, adress, email, pessel, year);
    }
    public void addTechnology(Technology technology)
    {
        this.technology.add(technology.name);
        this.Sum += technology.bonus;
    }
    @Override
    public int calculateSalary()
    {
        int Sallary =0;
        Sallary = super.calculateSalary()+this.Sum;
        return Sallary;
    }
}

