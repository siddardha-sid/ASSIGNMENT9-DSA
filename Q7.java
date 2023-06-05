package problems;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ABC";
        System.out.println("Permutations of " + s1 + ":");
        generatePermutations(s1, 0, s1.length() - 1);
        
        System.out.println();
        
        String s2 = "XY";
        System.out.println("Permutations of " + s2 + ":");
        generatePermutations(s2, 0, s2.length() - 1);
	}
	public static void generatePermutations(String s, int start, int end) {
        if (start == end) {
            System.out.println(s);
        } else {
            for (int i = start; i <= end; i++) {
                s = swap(s, start, i);
                generatePermutations(s, start + 1, end);
                s = swap(s, start, i); 
            }
        }
    }
    
    public static String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
