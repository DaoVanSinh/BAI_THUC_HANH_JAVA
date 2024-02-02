import java.util.Scanner;

public class Slide74Chuong2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong cua mang: ");
        int n = scanner.nextInt();

        int[] mang = new int[n];

        System.out.println("Nhap gia tri cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }

        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                tong += mang[i];
            }
        }

        System.out.println("Tong cac so chan cua mang la: " + tong);

        scanner.close();
    }
}