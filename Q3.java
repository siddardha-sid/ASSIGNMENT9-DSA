package problems;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(factorial(3));;
	}
	public static int factorial(int n) {
		if(n==1 || n==0) {
			return n;
		}
		return n * factorial(n-1);
	}

}
