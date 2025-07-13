// swap two numbers(without using third variable)
/*
import java.util.Scanner;
class Main {
    public static void swap(int num1,int num2){
        System.out.println("Before swapping: num1 = " + num1 + ", num= " + num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the two numbers:");
        int n1=s.nextInt();
        int n2=s.nextInt();
        swap(n1,n2);
    }
}
 */
//find largest of three numbers
 /* 
import java.util.Scanner;

class Main {
    static void largest(int n1, int n2, int n3) {
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is the largest number among " + n1 + ", " + n2 + ", and " + n3);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is the largest number among " + n1 + ", " + n2 + ", and " + n3);
        } else {
            System.out.println(n3 + " is the largest number among " + n1 + ", " + n2 + ", and " + n3);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        largest(num1, num2, num3);
    }
}
     */
    //count vowels and consonants
import java.util.Scanner;
class Main {
    static void count_vowels_and_consonants(String st){
       int consonants=0;
       int no_vowels=0;
       for(int i=0;i<st.length();i++){
            char letter=Character.toLowerCase(st.charAt(i));
           
            if(letter=='a'|| letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                no_vowels++;
            }
            else if(letter==' '){
               continue;
            }
            else{
                consonants++;
            }
        }
      System.out.println("the number of vowels are "+no_vowels+" and consonants are "+consonants +" in the given string  "+st);
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("enter the string");
       String str=s.nextLine();
       count_vowels_and_consonants(str);
    }  
}


