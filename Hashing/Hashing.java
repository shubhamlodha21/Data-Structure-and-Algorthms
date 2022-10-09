import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        System.out.println("Hashing Functions");

        HashMap <Integer,Integer> mp = new HashMap<>();
        mp.put(1,21);//put - Insert
        mp.put(2,51);
        mp.put(3,101);
        mp.put(4,111);
        mp.put(9,121);
        mp.put(3,151);

        System.out.println("1==>" + mp.get(1));//get - display
        System.out.println("2==>" + mp.get(2));

        System.out.println("5==>" +mp.get(5));//If key not present Null
        System.out.println("5==>" +mp.getOrDefault(5, 0));// getOrDefault - If Key Not present and set default value

        System.out.println(mp);//Printing Whole HashMap with keys and values
        System.out.println("Size of HashMap: " + mp.size());//Returns Number of Keys
        
    }
}
