public class FindSecondSmallestNumberInAnArray {
    public static void main(String[] args) {
        int arr[]={-1,7,2,8,6,8};
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        System.out.println(arr[1]);
    }
}
