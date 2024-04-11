package People;

public class EmployeeFulltime extends Employee {
    // Fields
    public int ngaycong;
    public int namkinhnghiem;

    // Methods
    public EmployeeFulltime() {
        chucvu = "Full time";
        ngaycong = 0;
        namkinhnghiem = 0;
    }
    public void inputInformation() {
        super.inputInformation();
        System.out.print("Nhap so nam kinh nghiem : ");
        namkinhnghiem = sc.nextInt();
        System.out.print("Nhap so ngay lam viec : ");
        ngaycong = sc.nextInt();
    }

    public void caculatedSalary(int yearOfExperence) {
        if(yearOfExperence < 3) {
            luong = luong * luong + 50000;
        } else if(yearOfExperence < 6) {
            luong = luong * ngaycong + 100000;
        } else {
            luong = luong * ngaycong + 200000;
        }
    }
    public void outputInformation() {
        super.outputInformation();
        System.out.println("Year of experence : " + namkinhnghiem);
    }
}