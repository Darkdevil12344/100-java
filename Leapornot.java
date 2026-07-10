import java.util.Scanner;
public class Leapornot {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the year");
   int fi = sc.nextInt();
   if (fi%4==0) {
    System.out.println(fi+ "is leap year");
    }
    else {
    System.out.println(fi+ "is not a leap year" );
     sc.close();
    }


     
}

         }
