package problems;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] arr= {1,1,1,1,1};
		System.out.println(greatest(arr,0));;
	}
	public static int greatest(int[] arr,int index) {
		if(index==arr.length-1) {
			return arr[index];
		}
		int num=greatest(arr,index+1);
		return Math.max(num, arr[index]);
	}
}
