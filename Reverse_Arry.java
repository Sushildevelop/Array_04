package Practice.Array.Array_04;

public class Reverse_Arry {
    static int[] reverseArray(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        int j=0;
        for (int i=n-1;i>=0;i--){
            ans[j++]=arr[i];

        }

        return ans;
    }
    static void reverse(int a[]){
        int n= a.length;
        int i=0;
        int j=n-1;
                   while(i<j) {
                       int temp = a[i];
                       a[i] = a[j];
                       a[j] = temp;
                       j--;
                       i++;
                   }





    }

    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        int ans[]=reverseArray(a);
    /*     for (int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }

     */

//        for (int i=0;i< ans.length;i++){
//            System.out.print(ans[i]+" ");
//        }

    reverse(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }


    }
}
