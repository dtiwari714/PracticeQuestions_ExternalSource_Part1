public class FindCommonElementsInThreeSortedArrays {
    public static void main(String[] args) {
        int a[]={1,2,3,10,20,30};
        int b[]={1,2,10,20,30,40,60};
        int c[]={1,2,3,6,7,20,30};
        sortedElement(a,b,c);
        //1st Approch
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                for (int k = 0; k < c.length; k++) {
//                    if(a[i]==b[j]&&b[j]==c[k]){
//                        System.out.println(a[i]);
//                    }
//                }
//            }
//        }
    }

    public static void sortedElement(int[] a, int[] b, int[] c) {
        int x=0;
        int y=0;
        int z=0;
        while(x<a.length && y<b.length && z<c.length){
            if(a[x]==b[y]&&b[y]==c[z]){
                System.out.println(a[x]);
                x++;
                y++;
                z++;
            } else if (a[x]>b[y]) {
                y++;
            }
            else if(b[y]>c[z]){
                z++;
            }
            else{
                x++;
            }
        }
    }
}
