import java.util.Scanner;
public class Starpattern {
   public static void main(String[] args) {
   try (Scanner sc = new Scanner(System.in)) {
   System.out.println("enter the num fo print *");
   int num = sc.nextInt();
   for(int i=1;i<=num;i++) {
   for(int j=1;j<=i;j++) {
   System.out.print("*");
    }
System.out.println();
    }
}
      }
   }

         
