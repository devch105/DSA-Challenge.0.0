package DriveCDC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
       int arr[]={1,1,1,2,2,3,4,2};
       int freq=2;
        FrequencyCountnum(arr,freq);



    }
    public  static void FrequencyCountnum(int arr[], int fre){
        Map<Integer,Integer> freqMap=new HashMap<>();
        List<Integer> l1=new ArrayList<>();
        for(int i:arr){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()){
            if(entry.getValue()>=fre){
                System.out.println(entry.getKey());
            }
        }


    }


}
