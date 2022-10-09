import java.util.HashMap;

//Count the frequency of each element in Array

public class ElementFrequencyArray {
    public static void main(String[] args) {

        int Arr [] = {1,2,1,1,3,21,1,2,1,3,2,3};

        HashMap <Integer,Integer> mp = new HashMap<>();

        for(int i=0;i<Arr.length;i++)
        {
            mp.put(Arr[i], mp.getOrDefault(Arr[i],0)+1);
        }

        //System.out.println(mp.get(1));

        System.out.println(mp);
        
    }
    
}
