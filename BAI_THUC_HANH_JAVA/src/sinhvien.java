import java.util.Scanner;

public class sinhvien {
    public static void main(String[] args){
        student st=new sinhvien().new student();
        st.nhapthongtin();
        st.xuatthongtin();
    }
    class student{
    String ten;
    String gioitinh;
    String lop;
    String quequan;
    int tuoi;
    float chieucao;
    float cannang;
    float diema, diemb, diemc;
    

void nhapthongtin(){
   Scanner sc=new Scanner(System.in);
   System.out.print("Nhap ten ");
   ten=sc.nextLine();
   System.out.print("Nhap gioi tinh ");
   gioitinh=sc.nextLine();
   System.out.print("Nhap lop ");
   lop=sc.nextLine();
   System.out.print("Nhap que quan ");
   quequan=sc.nextLine();
   System.out.print("nhap tuoi ");
   tuoi=sc.nextInt();
   System.out.print("Nhap chieu cao ");
   chieucao=sc.nextFloat();
   System.out.print("Nhap can nang ");
   cannang=sc.nextFloat();
   System.out.print("Nhap diem A ");
   diema=sc.nextFloat();
   System.out.print("nhap diem B ");
   diemb=sc.nextFloat();
   System.out.print("Nhap diem C ");
   diemc=sc.nextFloat();
   
}
void xuatthongtin(){

    System.out.print("Thong tin sinh vien");
    System.out.print("Ten"+ten);
    System.out.print("gioi tinh"+ gioitinh);
    System.out.print("lop"+ lop);
    System.out.print("que quan"+quequan);
    System.out.print("Tuoi"+ tuoi);
    System.out.print("Chieu cao");
    System.out.print("Diem A :" + diema);
    System.out.print("Diem B" + diemb);
    System.out.print("Diem C" + diemc);
    System.out.print("Trung binh cong : "+ (diema+diemb+diemc)/3);

}
}
}
