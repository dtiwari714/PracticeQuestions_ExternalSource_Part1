public class MaximumOfAllSubarraysOfSizeK {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
        int maxsum=0;
        for (int i = 0; i < arr.length-k+1; i++) {
            int sum=0;
            for (int j = i; j < i+k; j++) {
                sum=sum+arr[j];
            }
            maxsum=Math.max(sum,maxsum);
            System.out.println(arr[i]+":"+maxsum);
        }
        System.out.println(maxsum);

        //Second method
        int start=0;
        int max=0;
        int sum=0;
        for (int end = 0; end < arr.length; end++) {
            sum=sum+arr[end];
            if(end>=k-1){
                max=Math.max(sum,max);
                sum=sum-arr[start];
                start++;
            }
        }
        System.out.println(max);

    }
}
