import java.util.Scanner;
public class Primenum {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the number");
   int fi = sc.nextInt();
   int sum=0;
   for(int i=1;i<=fi;i++){
    if(fi%i==0) {
    sum=sum+1;
}                    
}
   if (sum==2) {
    System.out.println(fi+ " is a prime number");
    }
    else {
    System.out.println(fi+ " is not a prime number" );
    sc.close();
    }


      
}

         }
