package problems;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(nthTerm(5,2,10));  ;
	}
	public static int nthTerm(int a,int d,int N) {
		if(N==1) {
			return a;
		}
		return(nthTerm(a+d,d,N-1));
	}

}
