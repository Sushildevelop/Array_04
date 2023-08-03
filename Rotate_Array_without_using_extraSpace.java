package Practice.Array.Array_04;

import java.util.Scanner;

public class Rotate_Array_without_using_extraSpace {

    static void reverse(int []arr , int start,int end){
       while(start < end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;

           start++;
           end--;
       }
    }

    static void rotateInPlace(int [] arr, int k){
      int n=arr.length;
     reverse(arr,0,n-k-1);
     reverse(arr,n-k,n-1);
     reverse(arr,0,n-1);
    }






    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("k: ");
        int k=sc.nextInt();

        rotateInPlace(arr,k);

        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }


    }
}
