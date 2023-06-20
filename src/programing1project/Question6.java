package programing1project;

public class Question6 {

	public static void main(String[] args) {
		
		int[] arr = {9,6,4,2,3,5,7,0,1};
		System.out.println("Missing number is: "+ missing_number(arr));

	}
	
	public static int missing_number (int[] arr) {
		
		int expect_sum, missNum, actual_sum=0;
		expect_sum = (0+arr.length)*(arr.length+1)/2; // use the formula to calculate sum of the array if there is no missing number
		
		for(int el : arr)
			actual_sum+=el; // calculate sum of the array with missing one number
		
		missNum = expect_sum-actual_sum;
		
		return missNum;
	}

}
