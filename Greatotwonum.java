import java.util.Scanner;
public class Greatotwonum {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter first the num");
   int fi = sc.nextInt();
    System.out.println("enter second the num");
   int so = sc.nextInt();
    if (fi>so) {
    System.out.println("greatest num is:" + fi);
    }
    else if (fi<so) {
    System.out.println("greatest num is:" + so);
    }
     else {
    System.out.println("both are same");
    }


      sc.close();
}

         }
