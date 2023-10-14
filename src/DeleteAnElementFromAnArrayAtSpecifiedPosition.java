import java.util.Scanner;

public class DeleteAnElementFromAnArrayAtSpecifiedPosition {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size Array Number:");
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for (int i = 0; i <n; i++) {
//            arr[i]=sc.nextInt();
//        }
        int arr[]={4,5,6,8,9,3};
        int n= arr.length;
        //System.out.println("Enter the position to remove Element:");
        int pos=3;
        if(pos<0||pos>n){
            System.out.println("Position is not correct");
        }
        else{
            for (int i = pos; i < n-1; i++) {
                arr[i]=arr[i+1];
            }
            n--;
            System.out.println("After Deleteting");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
