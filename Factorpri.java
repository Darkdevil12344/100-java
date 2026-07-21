import java.util.Scanner;
public class Factorpri {
public static void main(String[]args) { 
try (Scanner sc = new Scanner(System.in)) {
System.out.println("enter the num");
int num =sc.nextInt();
for (int i=1;i<=num;i++) { 
int sum=0;
for (int j=1;j<=i;j++){
 if(i%j==0) {
sum = sum+1;
} 
}
if(sum==2){

 if(num%i==0) { 
 System.out.println(i);
}
}
}
System.out.println();
}
}
}