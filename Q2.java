package problems;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(64)); ;
	}
	public static boolean power(int n) {
		if(n==1 || n==0) {
			return true;
		}
		if(n%2!=0) {
			return false;
		}
		return power(n/2);
	}

}
