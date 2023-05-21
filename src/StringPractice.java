import java.io.*;
public class StringPractice {
    public static void main(String[] args) {


       /* String s = "himanshusharma";
        System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));/*

 // 1.
        // Checking if the string is panagram
 /*       String s = "The quick brown fox jumps over the lazy dog ";
        System.out.println(isPanagram(s));
    }

    static boolean isPanagram(String s) {
        int n = s.length();
        if (n < 26)
            return false;
        boolean visited[] = new boolean[26];
        for (int i = 0; i < n; i++) {
            char x = s.charAt(i);
            if (x >= 'a' && x <= 'z') {
                visited[x - 'a'] = true;
            }
            if (x >= 'A' && x <= 'Z') {
                visited[x - 'A'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (visited[i] == false) {
                return false;
            }
        }
        return true;/*


        */
// 2. Pattern Searching
/*String txt= "geeks for geeks";
String pat="geeks";
 patSearch(txt,pat);
    }
    static void patSearch(String txt,String pat){
        int pos=txt.indexOf(pat);
        while(pos>=0){
            System.out.println(pos+ " ");
            pos=txt.indexOf(pat,pos+1);
        }/*
 3. Extra Character using Bitwise Xor */
 /*String s1="abc";
 String s2="acba";
        System.out.println(findExtra(s1,s2));
    }
    static char findExtra(String s1, String s2){
        int res=0;
        int n= s1.length();
        for(int i=0;i<n;i++){
            res= res^s1.charAt(i)^s2.charAt(i);
        }
        res=res^s2.charAt(n);
        return (char)res;

 4. Checking IF THe String Is Anagram */
  /*      String s1 = "adbca";
        String s2 = "acdba";

        System.out.println(areAnagram(s1, s2));
    }
    static final int CHAR=256;
    static boolean areAnagram(String s1, String s2){
        if(s1.length()!=s2.length())
            return false;
        int count[]=new int[CHAR];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0){
                return false;
            }

        }
        return true;

 5. N in String format, Its Binary Equivalent  */
 /*       String N="2";
        int[] binaryNum= new int[1000];
     int i=0;
     int b=Integer.parseInt(N);
     if(b==0){
         return;
     }
     while(b>0){
         binaryNum[i]=b%2;
         b=b/2;
         i++;
     }
     for(int j=i-1;j>=0;j--)
         System.out.println(binaryNum[j]);

 /*6. S String Binary to Decimal  */
  /*  String s= "10";
    int m=0;
    int k=1;
    for(int i=s.length()-1;i>=0;i--)
    {
        m+=(s.charAt(i)-'0')*k;// '0' to convert string to integer
        k=k*2;
    }
        System.out.println(m);
7.
   */

    }
}






