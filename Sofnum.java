import java.util.Scanner;
public class Sofnum {
   public static void main(String[] args) {
  try( Scanner sc = new Scanner(System.in)){
   System.out.println("enter the num");
   int num = sc.nextInt();
int sum=0;
   for (int i=1;i<=num;i++) {
    sum=sum+i;

   }
   System.out.println("sum is " + sum);

}
}
}
         