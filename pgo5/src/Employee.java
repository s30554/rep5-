import java.time.Year;
public class Employee {
    public String imie;
    public String nazwisko;
    public String adres;
    public String email;
    public int pesel;
    public int rok;
    public int raise;
    public int pensja = 3000;

    int year = Year.now().getValue();
    int calculateSalary = 3000 + (rok - year) * raise;

    public Employee(){
    this.imie=imie;
    this.nazwisko=nazwisko;
    this.adres=adres;
    this.email=email;
    this.pesel=pesel;
    this.rok=rok;
    this.pensja=pensja;

    }

}
