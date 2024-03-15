import java.util.Scanner;

public class nhanvien {
    public static void main(String[] args) {
        Employee ep=new nhanvien().new Employee();
        ep.NhapThongTin();
        ep.XuatThongTin();
    }
    class Employee{
        String Ten,ChucVu;
        int sogiolamtrongthang;
        Float Luong;
        int luongtheogio=25000;
        int phucapthang=100000;
    void NhapThongTin(){
       Scanner sc=new Scanner(System.in);
       System.out.print("Nhap Ten nhan vien : ");
       Ten=sc.nextLine();
       System.out.print("Chuc vu :");
       ChucVu=sc.nextLine();
       System.out.print("So gio cong trong thang : ");
       sogiolamtrongthang=sc.nextInt();       
    }
    void XuatThongTin(){
        System.out.println("Ten nhan vien : " + Ten );
        System.out.println("Chuc vu : " + ChucVu );
        System.out.println("So gio cong trong thang la : " + sogiolamtrongthang );
        if(sogiolamtrongthang>=100){
        System.out.println("Tong luong : "+ (sogiolamtrongthang*luongtheogio+phucapthang));
        }
        else {
            System.out.println("Tong luong : "+ (sogiolamtrongthang*luongtheogio));
        }
    }
}
}
