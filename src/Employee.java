import java.time.Year;

public class Employee {
    public String fname;
    public String lname;
    public String adress;
    public String email;
    public String pessel;
    public int year;
    public int sallary;
    public Employee(String fname, String lname, String adress, String email, String pessel, int year, int sallary){
        this.fname=fname;
        this.lname=lname;
        this.adress=adress;
        this.email=email;
        this.pessel=pessel;
        this.year=year;
        this.sallary=sallary;

    }
    public int countSallary()
        int sallary=0;
        int timeincompany = Year.now().getValue()-this.year;
        sallary = 3000 + (1000*timeincompany);
        return sallary ;

}