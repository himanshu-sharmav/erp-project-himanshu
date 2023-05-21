import java.util.Scanner;

public class MaxinArray {
    public static void main(String[] args) {
        Scanner s=new Scanner((System.in));
        int n= s.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(largest(arr,n));

    }
    static int largest(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
             max=arr[i];
            }
        }
        return max;
    }

}

