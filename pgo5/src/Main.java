import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
       int totalAmount=0;
       for(Employee employee : employees){
           totalAmount =+ employee.calculateSalary;
       }
       Developer developer = new Developer();
       Tester tester = new Tester();
       Menager menager = new Menager();
    }
}