
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int[] sortIfNotSorted(int [] arr){
        int [] copy=Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        if(Arrays.equals(copy, arr)){
            return arr;
        }
        else{
            return copy;
        }
    }
    public static int checkForTarget(int [] arr,int target){
        int high=(arr.length-1);
        for(int low=0;low<=high;){
            int mid=((low+high)/2);       
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
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
        arr=sortIfNotSorted(arr);
        int result=checkForTarget(arr,target);
        if(result!=-1){
            System.out.print("the target value "+target+" is found at the index "+result+" in the given array "+Arrays.toString(arr));
        }
        else{
            System.out.print("the target value "+target+" is not found in the given array "+Arrays.toString(arr));
        }
    }
}
