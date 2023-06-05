package problems;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1};
  System.out.println(arrayProduct(arr,arr.length-1)); ;
	}
	public static int arrayProduct(int[] arr,int n) {
		if(arr.length<=0) {
			return -1;
		}
		if(n==0) {
			return arr[n];
		}
		return arr[n]*arrayProduct(arr,n-1);
		
	}

}
