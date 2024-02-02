import java.util.Scanner;

public class Slide90Chuong2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();

        System.out.println("Cac ki tu trong chuoi:");

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }

        scanner.close();
    }
}