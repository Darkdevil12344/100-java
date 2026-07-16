import java.util.Scanner;
public class Strong {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the num");
   int num = sc.nextInt();
   int end=num;
   int rem;
   int sum =0;
   
    
    while(num>0) {
 int fact=1;
     rem=num%10;
      for(int i=1;i<=rem;i++) {
      fact=fact*i;
      
      } 
       sum=sum+fact;
      
      num=num/10;
    }
    if (end==sum) {
      System.out.println("strong number");
    }
    else {
      System.out.println("not strong number");
    }
sc.close();
      }
   }

         
