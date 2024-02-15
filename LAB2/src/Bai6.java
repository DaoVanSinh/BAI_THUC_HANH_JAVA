import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so nguyen duong: ");
        int soNguyenDuong = scanner.nextInt();

        while (soNguyenDuong <= 0) {
            System.out.print("Vui long nhap lai so nguyen duong: ");
            soNguyenDuong = scanner.nextInt();
        }

        long giaiThua = 1;
        int i = 1;

        do {
            giaiThua *= i;
            i++;
        } while (i <= soNguyenDuong);

        
        System.out.println("Giai thua cua " + soNguyenDuong + " la: " + giaiThua);

        scanner.close();
    }
}
