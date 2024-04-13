import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        int totalAmount=0;
        for(Employee employee : employees){
            totalAmount =+ employee.calculateSalary;
        }
        System.out.println("Total amount to be paid this month:"+ totalAmount +" USD");

        Developer developer = new Developer("Gianluigi", "Buffon", "Turyn", "gg@buffon.email.com", "123456789", 2020 );
        Tester tester = new Tester("Raul", "Gonzalez", "Madryt", "raul@email.com", "987654321", 2021);
        Menager menager = new Menager("Alex", "Ferguson", "Manchester", "sir.alex@email.com" "192837465",2019 );
        Technology technology - new Technology("Java", 800);
        developer.addTechnology(t);
        employees.add(developer);
        tester.addTestType("UI/UX");
        employees.add(tester);
        Goal goal=new Goal("Implementing FB login",10,1000,15);
        goal.goalCompleted();
        menager.addGoals(goal);
        employees.add(menager);



    }
}