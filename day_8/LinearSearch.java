//linear search
import java.util.Arrays;
import java.util.Scanner;
public class LinearSearch {
    public static int search(int [] arr,int key){
        
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of a array:");
        int size=s.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the index "+i+" element of array:");
            arr[i]=s.nextInt();
        }
        System.out.print("enter the the target value to search: ");
        int target=s.nextInt();
        int result=search(arr,target);
        if(result!=-1){
            System.out.println(target+" is found at index "+(result)+" of given array "+Arrays.toString(arr));
        }
        else{
            System.out.println(target+" is not found in the given array  "+Arrays.toString(arr));
        }

    }
}
