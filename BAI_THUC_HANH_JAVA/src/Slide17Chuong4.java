import java.util.ArrayList;
public class Slide17Chuong4
{
public static void main (String args[])
{
ArrayList<String> arrayListStrings = new ArrayList<>();
    arrayListStrings.add("JAVA");
    arrayListStrings.add("PHP");
    arrayListStrings.add("C#");
    arrayListStrings.add("C++");
    System.out.println("Cac phan tu co trong arrListString la :");
    for (int i=0;i< arrayListStrings.size();i++){
        System.out.print(arrayListStrings.get(i)+"\t");
    }
}}
