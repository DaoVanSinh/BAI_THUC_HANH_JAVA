import java.util.ArrayList;

public class Slide18Chuong4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(1);
        arrListInteger.add(9);
        System.out.println("Cac phan tu trong arrListInteger la :");
        for(int number : arrListInteger){
            System.out.print(number+"\t");
        }

    }
}
