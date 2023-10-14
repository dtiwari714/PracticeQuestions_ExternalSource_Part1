public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,8};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
    }
}
