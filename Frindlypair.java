import java.util.Scanner;
public class Frindlypair {
 public static void main(String[] args) {
  try( Scanner sc = new Scanner(System.in)){
   System.out.println("enter the num");
   int num = sc.nextInt();
   System.out.println("enter the num2");
   int num2 = sc.nextInt();
   int div=0;
   int div2=0;
   for (int i = 1; i<=num; i++) {
       if(num%i==0){ 
        div = div+i;
       }
   }
   int ans=0;
   if(div>num) {
    ans=div/num;

   }
   for (int i = 1; i<=num2; i++) {
       if(num2%i==0){ 
        div2 = div2+i;
       }
   }
   int ans2=0;
   if(div2>num2) {
    ans2=div2/num2;

   }
    if(ans==ans2){
    System.out.println("it is frindly pair");
    }
    else{
    System.out.println("it is not frindly pair");
    }
}
 }
}