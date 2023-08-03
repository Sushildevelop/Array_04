package Practice.Array.Array_04;

public class Swap_twoValues {
    static void swap(int a , int b){
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("a: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap : ");
        System.out.println("a: "+a);
        System.out.println("a: "+b);
    }
    public static void main(String[] args) {
        int a=9;
        int b=3;
        swap(a,b);
    }
}
