//print  right angled triangel pattern
/* 
import java.util.Scanner;
class RightAngledTrianglePattern{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of pattern: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
*/

// print Full Pyramid or Centered Triangle pattern
/* 
import java.util.Scanner;
public class pattern{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of pattern: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
           }
           for(int k=0;k<i;k++){
               System.out.print("*");
           }
           System.out.println();
        }
    }
}
*/
// print Diamond Pattern or Full Diamond of Stars
import java.util.Scanner;
public class day_4{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of pattern: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
          }
          for(int x=0;x<i;x++){
              System.out.print("*");
          }
          System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            for(int x=1;x<n-i;x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
