public class Segregate0sAnd1sInAnArray {
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,0,1,1,0};
        int countOs=0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                countOs++;
            }
        }
        //System.out.println(countOs);
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < countOs; j++) {
                arr[j]=0;
            }
            System.out.print(arr[k]+" ");
            for (int j = n-countOs; j <n ; j++) {
                arr[j]=1;
            }
        }

    }
}
