import java.util.ArrayList;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter the string:");
        String str=s.nextLine();
        System.out.println("Original string: "+str);
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            arr.add(str.charAt(i));
        }
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==' '){
                arr.set(i,'_' );
            }
        }
        String new_str="";
        for(int i=0;i<arr.size();i++){
            new_str+=arr.get(i);
        }
        System.out.println("String after replacing spaces: "+new_str);
    }
}

// Original string: hello world java
// String after replacing spaces: hello-world-java
