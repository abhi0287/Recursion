import java.util.*;
public class Fibonacci {
	
	public static int fibonacci(int i) {
       if(i==0)
    	   return 0;
       else if(i==1)
           return 1;
       else
    	   return fibonacci(i-1)+fibonacci(i-2);  
	}
	
   public static void main(String[] x) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the nth");
	   int n= sc.nextInt();
	   for(int i=0;i<n;i++) {
		   System.out.println(fibonacci(i)+" ");
	   }
   }
}
