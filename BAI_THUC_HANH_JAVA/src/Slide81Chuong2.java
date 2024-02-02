import java.util.Scanner;

public class Slide81Chuong2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int hang = scanner.nextInt();
        System.out.print("Nhap so cot cua ma tran : ");
        int cot = scanner.nextInt();

       
        int[][] maTran = new int[hang][cot];

        
        System.out.println("Nhap gia tri phan tu cua ma tran:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Ma tran [" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextInt();
            }
        }

        
        int max = maTran[0][0];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                }
            }
        }

        
        System.out.println("Phan tu co gia tri lon nhat trong ma tran la: " + max);

        
        scanner.close();
    }
}