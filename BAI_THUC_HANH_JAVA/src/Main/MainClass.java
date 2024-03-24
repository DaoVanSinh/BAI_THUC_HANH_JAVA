package Main;

import Hinh.Hinhchunhat;
import Hinh.Hinhtron;
import Hinh.Hinhtru;
import Hinh.Hinhchunhat;
import Hinh.Hinhvuong;

public class MainClass {
    public static void main(String[] args) {
        Hinhtron ht=new Hinhtron();
        ht.NhapBanKinh();
        ht.xuatTen();
        ht.tinhChuVi();
        ht.tinhDientich();
        ht.inChuVi();
        ht.inDienTich();

        Hinhtru htr=new Hinhtru();
        htr.xuatTen();
        htr.nhapChieuCao();
        htr.tinhTheTich();
        htr.inTheTich();

        Hinhchunhat hcn=new Hinhchunhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        Hinhvuong hv=new Hinhvuong();
        hv.xuatTen();
        hv.NhapCanh();
        hv.xuatdulieu();
        hv.inChuVi();
        hv.inDienTich();
    }
}
