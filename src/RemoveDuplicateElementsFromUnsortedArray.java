import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromUnsortedArray {
    public static void main(String[] args) {
        int arr[]={7,5,3,2,7,9,6};
        int n=arr.length;
        int temp=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
//        Set<Integer> arr1=new HashSet<Integer>();
//        for (int k = 0; k < n; k++) {
//            if(arr1.contains(arr[k])){
//                System.out.println(arr[k]);
//            }
//            else{
//                arr1.add(arr[k]);
//            }
//        }
//        System.out.println(arr1);
        int j=0;
        for (int k = 0; k < n-1; k++) {
            if(arr[k]!=arr[k+1]){
                arr[j++]=arr[k];
            }
        }
        arr[j++]=arr[n-1];
        for (int l = 0; l < n-1; l++) {
            System.out.print(arr[l]+" ");
        }


    }
}
