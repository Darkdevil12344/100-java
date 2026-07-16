/*import java.util.Scanner;
public class Pownum {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the num and power");
   int num = sc.nextInt();
   int powe = sc.nextInt();
   double ans = Math.pow(num,powe);
   System.out.println(ans);
      }
   }
*/
         
import java.util.Scanner;
public class Pownum {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the num and power");
 int num = sc.nextInt();
   int pow = sc.nextInt();
double ans=1;
   for(int i=0;i<pow;i++) {
    ans=ans*num;
   }   
      System.out.println(ans);
      sc.close();
      }
   }

         
