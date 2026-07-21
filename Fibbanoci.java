import java.util.Scanner;
public class Fibbanoci {
   public static void main(String[] args) {
   try (Scanner sc = new Scanner(System.in)) {
   System.out.println("enter the num");
   int num = sc.nextInt();
   int x=0;
   int y=1;
   int z;
   System.out.println(x);
   System.out.println(y);
      for(int i=1;i<=num;i++) {
      z=x+y;
      x=y;
      y=z;

      System.out.println(z);
    }
   
      }
   }
   }

         
