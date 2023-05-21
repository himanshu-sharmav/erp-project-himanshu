import java.util.Scanner;
public class daybeforeNday {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int d=s.nextInt(); //day
int n=s.nextInt(); // before
int x= n%7;
int ans= d-x;
if(ans>=0){
    System.out.println(ans);
}
else{
    System.out.println(ans+7);
}
    }
}
