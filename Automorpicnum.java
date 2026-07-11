import java.util.Scanner;
public class Automorpicnum {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the num to find");
   int num = sc.nextInt(); 
   int End = 0 ,place=1;
   int alt =num;
   int fin =num*num;
   
   int len=0;
   
while (alt>0) { 
    len++;
    alt=alt/10;
   }
   for (int i=0;i<len;i++) {
    place=place*10;
     
   }
   
   End=fin%place;

   if(num==End) {
   System.out.println("the given num is automorpic");
   }
   else {
   System.out.println("the given num is not automorpic");
   sc.close();
   }
}
   }
   

         
