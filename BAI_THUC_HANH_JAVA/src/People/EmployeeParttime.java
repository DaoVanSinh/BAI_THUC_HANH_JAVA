package People;

public class EmployeeParttime extends Employee{
    // Fields
    public int giocong;

    // Methods
    public EmployeeParttime() {
        chucvu = "Part time";
        giocong = 0;
    }
    public void inputInformation() {
        super.inputInformation();
        System.out.print("Nhap so gio lam viec : ");
        giocong = sc.nextInt();
    }
    public void caculatedSalary() {
        luong *= giocong;
    }
    public void outputInformation() {
        super.outputInformation();
    }
}