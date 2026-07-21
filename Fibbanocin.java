import java.util.Scanner;
public class Fibbanocin {
   public static void main(String[] args) {
   try (Scanner sc = new Scanner(System.in)) {
   System.out.println("enter the num");
   int num = sc.nextInt();
   int x=0;
   int y=1;
   int z=0;
      for(int i=1;i<=num;i++) {
      z=x+y;
      x=y;
      y=z;

      
    }
    System.out.println(z);
      }
   }
    
   }

         
