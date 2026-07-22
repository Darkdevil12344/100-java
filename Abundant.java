import java.util.Scanner;
public class Abundant {
 public static void main(String[] args) {
  try( Scanner sc = new Scanner(System.in)){
   System.out.println("enter the num");
   int num = sc.nextInt();
   int div=0;
   for (int i = 1; i<num; i++) {
       if(num%i==0){ 
        div = div+i;
       }
   }
   int ans=0;
   if(div>num) {
    ans=div-num;

   }

    System.out.println(ans);
}
 }
}