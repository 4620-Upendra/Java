// package day_7;
//check aragram strings are not
import java.util.Scanner;
public class Anagram {
    public static char[] processArr(String str ){
        char[] arr=new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        return arr;
    }
    public static boolean  CheckAnagram(String str1,String str2){
           if(str1.length()==str2.length()){
               char[] arr1=processArr(str1.toLowerCase());
               char[] arr2=processArr(str2.toLowerCase());
               for(int i=0;i<arr1.length;i++){
                char ch=arr1[i];
                int count1=0;
                int count2=0;
                for(int j=0;j<arr1.length;j++){
                    if(ch==arr1[j]){count1++;}
                    if(ch==arr2[j]){count2++;}
                }
                if(count1!=count2){return false;}
                }
                return true;
            }
            else{return false;}  
    }    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string1: ");
        String str1=s.nextLine();
        System.out.print("enter the string2: ");
        String str2=s.nextLine();
        if(CheckAnagram(str1,str2)){
            System.out.println("given strings are anagram strings ");
        }
        else{
            System.out.println("given strings are not anagram strings ");
        }
    }
    
}

