//find second largest number in array
// package day_7;
import java.util.Arrays;
import java.util.Scanner;
public class second_largest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=s.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++){
            System.out.print("enter the index "+i+" element of array: ");
            arr[i]=s.nextInt();
        }
        System.out.println("given array:"+Arrays.toString(arr));
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                    second_largest=largest;
                    largest=arr[i];  
                }
            else if(arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
            }
            

        }
        System.out.println("the second largest number in array is "+second_largest);
    }
}
