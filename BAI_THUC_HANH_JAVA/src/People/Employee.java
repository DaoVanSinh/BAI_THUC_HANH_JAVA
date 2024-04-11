package People;

public class Employee extends Person {
    // Fields
    public String chucvu;
    public double luong = 20000;
    public String maNV;

    // Methods
    public Employee() {
        maNV = "";
        chucvu = "";
    }
    public void outputPosition() {
        System.out.println("Vi tri : " + chucvu);
    }
    public void inputInformation() {
        super.inputInformation();
        System.out.print("Nhap ma nhan vien : ");
        maNV = sc.next();
    }
    public void outputInformation() {
        super.outputInformation();
        System.out.println("Id : " + maNV);
        System.out.println("Salary : " + luong + "VND");
    }
}