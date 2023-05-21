import java.util.Scanner;

public class SquarePattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int s = sc.nextInt();
            //Complete the code given below
        for(int i=1;i<=s;i++){
            if(i==1||i==s){
                for(int j=1;j<=s;j++)
                    System.out.print("* ");
            }
            else{
                for(int j=1;j<=s;j++){
                    if(j==1||j==s)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
