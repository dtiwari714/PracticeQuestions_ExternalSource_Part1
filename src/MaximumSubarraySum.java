public class MaximumSubarraySum {
    public static void main(String[] args) {
        int arr[]={1,2,-5,4,5,6,7};
        int sum=arr[0];
        int maxsum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(sum<0){
                sum=arr[i];
            }
            else{
                sum=sum+arr[i];
            }
            maxsum=Math.max(sum,maxsum);
            //System.out.println(arr[i]+" :"+maxsum);
        }

    }
}
