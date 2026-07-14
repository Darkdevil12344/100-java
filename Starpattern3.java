import java.util.Scanner;
public class Starpattern3 {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the num for print line");
   int num = sc.nextInt();
   System.out.println("enter the num for print *");
   int str = sc.nextInt();
   for(int i=1;i<=num;i++) {
   for(int j=1;j<=i;j++) {
   System.out.print(" ");
    }
    for(int k=1;k<=str;k++){
    System.out.print("*");
    }
    System.out.println();
    }
    
      }
   }

         
