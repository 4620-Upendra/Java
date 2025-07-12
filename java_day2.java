// 1)Print Fibonacci series(n terms).

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//        System.out.print("enter a number of terms: ");
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        if(n>0){
//        int [] arry=new int[n];
//        arry[0]=0;
//        arry[1]=1;
//        for(int i=2;i<n;i++){
//            arry[i]=arry[i-1]+arry[i-2];
//        }
//        System.out.print("the fibonacci series of "+n+" terms is ");
//        for(int i:arry){
//            System.out.print(i);
//            System.out.print(" ");
//        }
//        }
//        else{
//            System.out.println("Please enter a positive integer");
//        }
//     }
// }

// 2check a number is a prime number or not.

// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         System.out.print("enter the number ");
//         int n=s.nextInt();
//         boolean isPrime=true;
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 isPrime=false;
//             }
//         }
//         if (n <= 1) {
//             System.out.println("The given number " + n + " is not a prime number.");
//         }
//         else if(isPrime){
//             System.out.println("the given number "+n+" is a prime number");
//         }
//         else{
//             System.out.println("the given number "+n+" is not a prime number");
//         }
//     }
// }

//3 the sum of digits in a number.ex:456->4+5+6=15

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number ");
        int n=s.nextInt();
        int number=n;
        int sum_of_digits=0;
        while(n!=0){
           sum_of_digits+=n%10;
           n/=10;
        }
        System.out.println("the sum of digits of "+number+" is "+sum_of_digits);
    }
}

