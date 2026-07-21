import java.util.Scanner;
public class harshad {
    public static void main(String[] args) {
   try (Scanner sc = new Scanner(System.in)) {
   System.out.println("enter the num");
   int num = sc.nextInt();
   int alt=num;
   int d;
   int sum=0;
   while(num>0) {
    d=num%10;
    sum=sum+d;
    num=num/10;
   }
    if(alt%sum==0) {
       System.out.println("it is harshad"); 
    }
    else {
        System.out.println("it is not harshad"); 
    }
}
    }
}
