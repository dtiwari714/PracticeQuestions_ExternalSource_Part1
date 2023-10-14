public class FindPairsInArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int total=9;
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]>total){
                high--;
            }
            else if(arr[low]+arr[high]<total){
                low++;
            }
            else if(arr[low]+arr[high]==total){
                System.out.println("("+arr[low]+","+arr[high]+")");
                low++;
                high--;
            }
            else{
                System.out.println("Not Any Duplicate found");
            }
        }
    }
}
