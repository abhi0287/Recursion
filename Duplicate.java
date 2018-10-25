import java.util.Scanner;
class Duplicate{
	public static void main(String[] args){
		String a;
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		int y=0;
		int len=a.length();
		int initial=0;
        char arr[]=new char[len];
		doit(arr,a,len,initial,y);
		print(arr,y);
	}
	public static void doit(char arr[],String a,int len,int initial,int y){
		if(initial+1>len-1){
			arr[y]=a.charAt(initial);
			return;
		}
		else{
			if( (a.charAt(initial)==a.charAt(initial+1))){
			doit(arr,a,len,initial+1,y);
			}else
			{
				arr[y]=a.charAt(initial);
				doit(arr,a,len,initial+1,y+1);
			}
		}
	}
	public static void print(char arr[],int y){
		if(y>=arr.length-1){
			return;
		}else{
		 System.out.print(arr[y]);
		 print(arr,y+1);
		}
		}

	
}
