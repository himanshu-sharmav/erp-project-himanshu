import java.util.Scanner;

public class Fibonnacia {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a=0, b=1;
        if(n==1)
            System.out.print(a);
        else if (n==2) {
            System.out.print(a+" "+ b);
        }
        else
            System.out.print(a+" "+b+" ");
        for(int i=3;i<=n;i++){
            int c= a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
