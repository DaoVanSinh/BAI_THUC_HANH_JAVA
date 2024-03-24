package Hinh;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc {
    public Hinhchunhat(){
        ten="Hinh chu nhat";
    }
    public float dai,rong;
    public void nhapChieuDai(){
        System.out.print("Chieu dai la :");
        Scanner sc=new Scanner(System.in);
        dai=sc.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.print("Chieu rong la :");
        Scanner sc=new Scanner(System.in);
        rong=sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi=(dai+rong)*2;
    }
    public void tinhDienTich(){
        DienTich=dai*rong;
    }
    
}
