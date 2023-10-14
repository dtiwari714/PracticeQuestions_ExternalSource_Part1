public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={7,6,8,5,3,5};
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
