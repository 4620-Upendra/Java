package day_6;
// Remove Duplicates from string
import java.util.ArrayList;
import java.util.Scanner;
public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter the string:");
        String str=s.nextLine();
        System.out.println("before removing Duplicates: "+str);
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            arr.add(str.charAt(i));
        }
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=' '){
                for(int j=i+1;j<arr.size();j++){
                    if(arr.get(i)==(arr.get(j))){
                        arr.remove(j);
                        j--;
                    }
                }
            }
        }
        String new_str="";
        for(int i=0;i<arr.size();i++){
            new_str+=arr.get(i);
        }
        System.out.println("after removing Duplicates: "+new_str);
    }
}
