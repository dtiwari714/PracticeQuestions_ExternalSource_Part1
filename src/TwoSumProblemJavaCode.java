public class TwoSumProblemJavaCode {
    public static void main(String[] args) {
        int arr[]={4,8,9,8,6,7};
        int target=16;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==target){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                    break;
                }
//                else{
//                    System.out.println("No number found in this array to follow this target");
//                }
            }
        }
    }
}
