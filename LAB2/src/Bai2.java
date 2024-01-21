import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a :");
Double a= scanner.nextDouble(); 

if(a%2==0)
System.out.println("a la so chan:"+a);
else if( a%2 !=0)
System.out.println("a la so le:"+a);
    }
}
