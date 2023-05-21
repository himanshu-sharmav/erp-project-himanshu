import java.util.Scanner;

public class nthTermOfAP {
public static int Nth_Term(int a,int n, int d){
    int ans= a+(n-1)*d;
    return ans;
        }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int n= sc.nextInt();
        int d=sc.nextInt();
        System.out.println(Nth_Term(a,n,d));
    }
    }
