package practice;
import java.util.*;
public class xy {
	
	public static int x_y(int x,int y) {
		int sum = 0;
		while(x!=0) {
			sum = sum+y;
			x--;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y = sc.nextInt();
		int sum = x_y(x,y);
		System.out.println("Multiplied value:- " +sum);
	}

}
