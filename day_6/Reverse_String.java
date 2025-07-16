package day_6;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string: ");
        String str=s.nextLine();
        System.out.println("before reversing string:"+str);
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        System.err.println("After reversing string:"+reverse);
    }
    
}


