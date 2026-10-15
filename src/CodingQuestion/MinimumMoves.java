package CodingQuestion;

import java.util.Arrays;
import java.util.List;

public class MinimumMoves {

	public static void main(String[] args) {
		System.out.println("Minimum Moves: " + minimumMoves(Arrays.asList(1234,4321),Arrays.asList(2345,3214)));

	}

	private static int minimumMoves(List<Integer> arr, List<Integer> arr1) {
		
		int moveSum=0;
		for(int i=0;i<arr.size();i++)
		{
			char[] d1 = String.valueOf(arr.get(i)).toCharArray();
			char[] d2 = String.valueOf(arr1.get(i)).toCharArray();
			for(int j=0;j<d1.length;j++) {
				if(d1[j] > d2[j])
					moveSum += d1[j] - d2[j];
				else if(d1[j] < d2[j])
					moveSum += d2[j] - d1[j];
			}
		}
		
		return moveSum;
	}

}
