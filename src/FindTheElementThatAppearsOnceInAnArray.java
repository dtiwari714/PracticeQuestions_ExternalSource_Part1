import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class FindTheElementThatAppearsOnceInAnArray {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,4,4,4,4,5,5};
        int result=0;
        Map<Integer, Integer> cout=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            cout.put(arr[i], cout.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:cout.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
        //IInd Method
                int[] arr1 = {1, 1, 2, 2, 3, 3, 4, 5, 5};
                int res = singleNonDuplicateUsingXor(arr1);
                System.out.println(res);
    }

    private static int singleNonDuplicateUsingXor(int[] arr) {
        int res = 0;
        for(int i: arr) {
            res ^= i;
        }
        return res;
    }
}

