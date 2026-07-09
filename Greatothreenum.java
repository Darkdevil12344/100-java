import java.util.Scanner;
public class Greatothreenum {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter first the num");
   int fi = sc.nextInt();
    System.out.println("enter second the num");
   int so = sc.nextInt();
   System.out.println("enter third the num");
   int th = sc.nextInt();
   if (fi>so&&fi>th) {
    System.out.println("greatest num is:" + fi);
    }
    else if (fi<so&&so>th) {
    System.out.println("greatest num is:" + so);
    }
    else if (fi<th&&so<th) {
    System.out.println("greatest num is:" + th);
    }

     else {
    System.out.println("both are same");
    sc.close();
    }


      
}

         }
