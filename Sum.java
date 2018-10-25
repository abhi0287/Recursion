import java.util.Scanner;
public class Sum{
     static int sum =0;
	public static int sum_ofintString(int i) {
	 int rem=0;
		if(i==0) {
			return 0;
		}
		else {
			rem = i%10;
			sum = sum + rem;
			i = i/10;
			sum_ofintString(i);
			}
		return sum;
	}
	public static void main(String[] x) {
               System.out.println("Works only for number present in a string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = Integer.parseInt(str);
		System.out.println(sum_ofintString(i));
		
	}
}











/*public class sum {
      static int sum = 0;
	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.nextLine();
	    int i = 0;
	    getValues(s1,i);
	  }
	  public static void getValues(String s1,int i) {	    
		  //int size = s1.length();
		  if (i < s1.length()){
	    	int no = Character.getNumericValue(s1.charAt(i));
	    	sum = sum+no;
	    	i++;
	    	getValues(s1,i);
		  }
		  else {
			  System.out.println(sum);
		  }
	  }
	  
}*/
