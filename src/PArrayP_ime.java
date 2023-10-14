public class PArrayP_ime {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9,10,11};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1) {
                continue;
            }
            boolean isprime=true;
            for(int j=2;j*j<=arr[i];j++){
                if(arr[i]%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(arr[i]);
            }
        }
    }
}
