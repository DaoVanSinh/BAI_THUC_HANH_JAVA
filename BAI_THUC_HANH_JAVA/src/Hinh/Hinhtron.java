package Hinh;

import java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public Hinhtron(){
        ten="Hinh Tron ";
    }
    public float r;
    public void NhapBanKinh(){
        System.out.print("Nhap ban kinh : ");
        Scanner sc=new Scanner(System.in);
        r=sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi=2*pi*r;
    }
    public void tinhDientich(){
        DienTich=pi*r*r;
    }
    
}
