
import java.util.Scanner;
public class Perfect  {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the num");
   int num = sc.nextInt();
   int sum=0;
   for(int i=1;i<num;i++) {
    if (num%i==0) {
      sum=sum+i;
        
    }

   }
   if (num==sum){
    System.out.println("perfect");
   }
   else {
    System.out.println("not");
   }

      }
     
}
    

