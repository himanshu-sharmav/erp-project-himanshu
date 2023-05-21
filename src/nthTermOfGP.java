package hye;
import java.lang.Math;
import java.util.Scanner;

public class nthTermOfGP{

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt();
        int r= s.nextInt();
        int n=s.nextInt();
        int b= a*(int)(Math.pow(r,n-1));
        System.out.println(b);
    }
}
