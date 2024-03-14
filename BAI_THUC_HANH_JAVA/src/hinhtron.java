import java.util.Scanner;
public class hinhtron{
    final float pi=3.14f;
    float r;
    float cv;
    float dt;

void nhapbankinh(){
    Scanner sc=new Scanner(System.in);
    r=sc.nextFloat();
    sc.close();
}
void tinhchuvi(){
    cv=2*pi*r;
}

void tinhdientich(){
    dt=pi*r*r;
}

void inchuvi(){
    System.out.print("chu vi hinh tron la " + cv);
}

void indientich(){
    System.out.print("dien tich hinh tron la " + dt);
}

}