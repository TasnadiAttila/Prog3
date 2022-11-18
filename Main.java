import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nevekArrayList = new ArrayList<String>();

        nevekArrayList.add("Kusper Gabor");
        nevekArrayList.add("Joksa Pista");

        for (var a : nevekArrayList)
        {
            System.out.println("Hello " + a + "!");
        }

        System.out.println("Monogrammok: ");
        for (var b : nevekArrayList)
        {
            String[] c = b.split(" ");
            System.out.println(c[0].toCharArray()[0] + "" + c[1].toCharArray()[0]);
        }


        HashMap<String,Integer> data = new HashMap<String, Integer>();
        for (var a : nevekArrayList)
        {
            data.put(a,(int) (Math.random()*100000));
        }

        for (var key : data.keySet()){
            System.out.println(key+" - "+data.get(key) + " Ft");
        }

        System.out.println("Megnövelt: ");
        for (var key : data.keySet()){
            Integer a = data.get(key) + (int)(data.get(key)*0.1);
            System.out.println(key+" - "+a+ " Ft");
        }

    }
}