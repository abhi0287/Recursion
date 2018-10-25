 import java.util.*; 
  public class Reverse{
     public static int[] reverse(int j,int arr[],int i){
         if(i<j){
                       int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			reverse( j-1,arr, i+1);
		} 
             return arr;
	}
     public static void main(String[] x){
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             int arr[] = new int[n];
             for(int i=0;i<n;i++){
                 arr[i] = sc.nextInt();
	       }
             int a[] = reverse(n-1,arr,0);
            for(int i:arr)
			System.out.print(i+" ");
	   }
	}
