package Hinh;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public Hinhtru(){
        ten="Hinh tru";
    }
public float h;
public void nhapChieuCao(){ 
    NhapBanKinh();
    System.out.print("Nhap chieu cao h :");
    Scanner sc=new Scanner(System.in);
    h=sc.nextFloat();
}
public void tinhTheTich(){
    tinhDientich();
    TheTich=h*DienTich;
}
}
