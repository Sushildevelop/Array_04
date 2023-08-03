package Practice.Array.Array_04;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class rotate_array {

    static int[] rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int []ans=new int[n];
        int j=0;
        for (int i=n-k;i<n;i++){
            arr[j++]=arr[i];
        }
        for (int i=0;i<n-k-1;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }








    public static void main(String[] args) {
     /*   arr 1 2 3 4 5
            k=1
                    arr 5 1 2 3 4
            k=2
                    arr 4 5 1 2 3

      */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("k: ");
        int k=sc.nextInt();
        rotate(arr,k);

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
