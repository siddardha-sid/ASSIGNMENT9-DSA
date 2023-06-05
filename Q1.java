package problems;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(sumOf(4));	;
	}
	public static int sumOf(int n) {
		if(n==1 || n==0) {
			return n;
		}
		return n+sumOf(n-1);
	}
	

}
