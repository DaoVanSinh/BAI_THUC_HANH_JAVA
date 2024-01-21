import java.util.Scanner;
public class Bai1 {
public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);

System.out.print("Nhap a :");
Double a= Sc.nextDouble();

System.out.print("Nhap b :");
Double b= Sc.nextDouble();

Double Tong = a+b , Hieu = a-b , Tich = a*b , Thuong=a/b, Du=a%b;
System.out.println("Tong cua hai so la :"+ Tong);
System.out.println("Hieu cua hai so la :"+ Hieu);
System.out.println("Tich cua hai so la :"+ Tich);
if(b==0){
    System.out.println(" Ket qua cua phep chia hai so khong xac dinh ");
}
else{
System.out.println("Thuong cua hai so la :"+ Thuong);
}
System.out.println("phan du khi chia lay du cua 2 so do la :"+Du );

if(a>b){
System.out.println("a lon hon b");
}
else if (a==b){
System.out.println("a bang b");
}
else {
System.out.println("a nho hon b");
}
}
}