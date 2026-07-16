
import java.util.Scanner;
public class Perfectsqr  {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the num");
   int num = sc.nextInt();
   int sep=0;
   int sqr = num*num;
   
   for(int i=1;i<=num;i++) {
     sep = sqr%10;
    sqr = sqr/10;
   }
   if (num==sep){
    System.out.println("perfect");
   }
   else {
    System.out.println("not");
   }

      }
     
}
    

