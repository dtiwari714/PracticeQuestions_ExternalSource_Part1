import java.util.HashSet;
import java.util.Set;

public class duplicateElementInArray {
    public static void main(String[] args) {
        int a[]={4,5,9,8,7,4,5};
        Set<Integer> arr=new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            if(arr.contains(a[i])){
                System.out.println(a[i]);
            }
            else{
                arr.add(a[i]);
                //System.out.println(arr);
            }
        }
    }
}
