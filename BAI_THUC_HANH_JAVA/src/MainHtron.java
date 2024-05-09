public class MainHtron {
    public static void main(String[] args) {
        Htron Ht = new Htron();
        Ht.setr(5);
        float ChuVi=Ht.tinhChuVi();
        float DienTich=Ht.tinhDienTich();
        System.out.println("Chu vi hinh tron"+ ChuVi +"va dien tich la " + DienTich + " ");
    }
}
