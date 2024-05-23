import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Nhập dãy số nguyên
        System.out.println("Nhap so phan tu cua day:");
        int n =scanner.nextInt();
        System.out.println("Nhap cac phan tu cua day");
        for(int i=0;i<n;i++){
            arrayList.add(scanner.nextInt());
        }
        

        // Tìm số nguyên có giá trị lớn nhất
        if (arrayList.isEmpty()) {
            System.out.println("Day so rong.");
        } else {
            int max = Collections.max(arrayList);
            System.out.println("So nguyen lon nhat trong day la: " + max);

            // Nhập vào một số nguyên để xóa khỏi mảng
            System.out.println("Nhap vao mot so nguyen de xoa khoi mang:");
            int removeNumber = scanner.nextInt();
            arrayList. removeIf(num -> num == removeNumber);

            // Sắp xếp dãy số
            Collections.sort(arrayList);
            System.out.println("Day so sau khi sap xep: " + arrayList);
        }
    }
}