
//1)Reverse a number (e.g., 1234 → 4321).

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("enter the number ");
//         int n=s.nextInt();
//         int number=n;
//         int reverse_no=0;
//        // System.out.println(n%10);  last number ex(355%10=5)
//         //System.out.println(n/10);  except last number ex(355/10=35)
//         while(n!=0){
//            reverse_no=reverse_no*10+n%10;
//            n/=10;
//         }
//         System.out.println("Reverse a number of "+number+" is "+reverse_no);
//     }
// }

//2.Check if a number is a palindrome.

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("enter the number ");
//         int n=s.nextInt();
//         int number =n;
//         int reverse_no=0;
//        // System.out.println(n%10);  last number ex(355%10=5)
//         //System.out.println(n/10);  except last number ex(355/10=35)
//         while(n!=0){
//            reverse_no=reverse_no*10+n%10;
//            n/=10;
//         }
//        if(number==reverse_no){
//            System.out.println("the given number "+number+" is palindrome number");
//        }
//        else{
//            System.out.println("the given number "+number+" is not palindrome number");
//        }
//     }
// }

//3.Find the sum of even numbers up to N.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("the sum of even numbers up to "+n+" is "+sum);
    }
}
