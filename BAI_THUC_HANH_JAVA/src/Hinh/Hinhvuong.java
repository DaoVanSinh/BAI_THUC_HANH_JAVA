package Hinh;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat {
    public Hinhvuong(){
        ten="Hinh vuong ";
    }
    public void NhapCanh(){
        System.out.print("Canh = ");
        Scanner sc= new Scanner(System.in);
        dai=rong=sc.nextFloat();

    }
    public void xuatdulieu(){
        tinhChuVi();
        tinhDienTich();
    }

}
