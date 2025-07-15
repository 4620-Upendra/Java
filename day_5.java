// 1)check if array is sorted or not
/*
import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=s.nextInt();
        int [] arr = new int[n];
        if(n>1){
        for(int i=0;i<n;i++){
            System.out.print("enter index "+i+" element of array:");
            int element=s.nextInt();
            arr[i]=element;
        }
        boolean array_sorted=true;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    array_sorted=false;
                }
            }
        }
            System.out.println(Arrays.toString(arr) + (array_sorted ? " is a sorted array" : " is not a sorted array"));
        }
        else{
            System.out.print("array size should greater than 1");
        }
    }
}
     */
    // 2)sort array without using Array.sort()
    /*
import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=s.nextInt();
        int [] arr = new int[n];
        if(n>1){
        for(int i=0;i<n;i++){
            System.out.print("enter index "+i+" element of array:");
            int element=s.nextInt();
            arr[i]=element;
        }
        System.out.println("unsorted array:"+Arrays.toString[arr]);
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array: "+ Arrays.toString(arr));
        }
        else{
            System.out.print("array size should greater than 1");
        }
    }
}
 */

//3) find duplicates in array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n=s.nextInt();
        int [] arr = new int[n];
        ArrayList<Integer> duplicates= new ArrayList<>();
        if(n>1){
        for(int i=0;i<n;i++){
            System.out.print("enter index "+i+" element of array:");
            int element=s.nextInt();
            arr[i]=element;
        }
       
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    
                }
            }
            if(count>0){
                duplicates.add(arr[i]);
            }
            
        }
        for(int i=0;i<arr.length;i++){
            
            for(int j=i+1;j<duplicates.size();j++){
                if(duplicates.get(i)==duplicates.get(j)){
                    duplicates.remove(j);
                }
            }
            
        }
        System.out.println("given array: "+Arrays.toString(arr));
        System.out.println("duplicates elements in array: "+ duplicates);
        }
        else{
            System.out.print("array size should greater than 1");
        }
    }
}
 
