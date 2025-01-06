import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str="";
        for(char i:a.toCharArray()){
            if(Character.isUpperCase(i)){
                str+=Character.toLowerCase(i);
            }
            else{
                str+=Character.toUpperCase(i);
            }
        }
        System.out.println(str);
    }
}