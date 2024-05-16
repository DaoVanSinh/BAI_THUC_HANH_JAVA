import java.util.HashSet;
import java.util.TreeSet;

public class Slide51Chuong4 {
    public static void main (String[] args){
        
        //Khai bao 1 HashSet co ten la HashSetInt
        //co kieu la Integer
        HashSet<Integer> hashSetInt =new HashSet<>();

        //Khai bao 1 hashSet co kich thuoc khoi tao = 32
        HashSet<Character> hashSetChar = new HashSet<>(32);

        //Khai bao 1 hashset co kich thuoc khoi tao = 16
        //va yeu to tai = 0.75f (macdinh)
        HashSet<String> hashSetString = new HashSet<>(16,0.75f);

        //HashSet<Float> hashSet duoc tao thanh tu 1 Collection khac 
        HashSet<Float> hashSetFloat = new HashSet<>(new TreeSet<>());
       }
}
