import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation\n 1. for Addition\n 2. for subtraction\n 3. for multiplication");
        int operation = sc.nextInt();
        if(operation!=1 && operation!=2 && operation!=3) {
            System.out.println("Invalid operation");
        }
        else{
                System.out.println("Enter first number:");
                int a = sc.nextInt();
                System.out.println("Enter second number:");
                int b = sc.nextInt();
              if(operation==1){
                 System.out.println(a+b);
             } else if (operation==2) {
                 System.out.println(a-b);
             } else if (operation==3) {
                 System.out.println(a*b);
             }
            }
        }

    }

