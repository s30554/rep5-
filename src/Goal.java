public class Goal {
    public String Name;
    public int month;
    public int day;
    public int bonus;
    public boolean made = false;


    public Goal(String name, int month, int bonus,int day) {
        Name = name;
        this.month = month;
        this.bonus = bonus;
        this.day = day;
    }
    public void goal_comppleted()
    {
        this.made = true;
    }
}
