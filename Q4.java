package problems;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(NandP(5,2)); ;
	}
	public static int NandP(int n,int p) {
		if(p==1 || p==0) {
			return n;
		}
		return n * NandP(n,p-1);
	}
}
