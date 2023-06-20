package programing1project;


public class Question5 {

	public static void main(String[] args) {

		int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
		int majority_element;
		
		majority_element = majority_element(arr);
		if(majority_element == -1)
			System.out.println("No majority element.");
		else
			System.out.println("The majority number is :"+majority_element);

	}
	
	public static int majority_element(int[] arr) {
		
		int max=0, index=0;
		for(int i=0 ; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j])
					count++;
			}
			// calculate the frequency for each number in the array 
			
			if(count > max) {
				max = count;
				index = i;
			}	// find the largest appearing times and the number's corresponding index		
		}

		if(max>(arr.length/2))
			return arr[index];
		else
			return -1;	
		// if the element that appears more than n/2 times, return the element, otherwise it proves no majority element
	}

}
