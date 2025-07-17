import java.util.Arrays;
import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter n value: ");
        int n=s.nextInt();
        System.out.print("enter the size of array: ");
        int array_size=s.nextInt();
        Integer [] arr=new Integer[array_size];
        for(int i=0;i<array_size;i++){
            System.out.println("enter the index "+i+" element of array: ");
            arr[i]=s.nextInt();
        }
        System.out.println("the missing numbers from 1 to "+n+" are ");
        for(int i=1;i<=n;i++){
            if(!Arrays.asList(arr).contains(i)){
                System.err.print(i+" ");
            }
        }
    }
}
