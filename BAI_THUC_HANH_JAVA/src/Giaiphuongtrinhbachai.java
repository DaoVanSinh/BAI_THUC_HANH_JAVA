import java.util.Scanner;

public class Giaiphuongtrinhbachai {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap a : ");
    Double a= scanner.nextDouble();

    System.out.print("Nhap b : ");
    Double b= scanner.nextDouble();

    System.out.print("Nhap c ");
    Double c= scanner.nextDouble();


    scanner.close();
    if(a==0){
        System.out.println("Day khong phai pt bac 2 ");    
    }
    else{
    Double delta = b*b-4*a*c;

    if(delta<0) {
    System.out.println("Phuong trinh vo nghiem");
    }
    else if(delta==0) {
    Double x =-b/(2*a);
    System.out.println("Phuong trinh co nghiem kep x=" + x);
}
   else {
    Double x1=(-b + (Math.sqrt(delta)))/(2*a);
    Double x2=(-b - (Math.sqrt(delta)))/(2*a);
    System.out.println("Phuong trinh co hai nghiem phan biet");
    System.out.println("x1 =" + x1);
    System.out.println("x2 =" + x2);
   }
 }


}
}