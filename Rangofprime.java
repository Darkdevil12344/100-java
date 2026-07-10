import java.util.Scanner;
public class Rangofprime {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter start the num");
   int st = sc.nextInt();
    System.out.println("enter end the num");
   int ed = sc.nextInt();

  System.out.println("the prime num in given range is");

   for (int i=st;i<=ed;i++) {
    int sum=0;
     for (int j=1;j<=i;j++) {
     if(i%j==0){
     sum=sum+1;

}
   
}
 if(sum==2){
    System.out.println(i);

   }
sc.close();

   }
   
   }

}
