import java.util.Scanner;
public class Rangnum {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter start the num");
   int st = sc.nextInt();
    System.out.println("enter end the num");
   int ed = sc.nextInt();
int sum=0;
   for (int i=st;i<=ed;i++) {
    sum=sum+i;

   }
   System.out.println("sum is " + sum);
   sc.close();
}
   

         }
