package programing1project;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		int arrSize;
		int[] arr;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please input the size of the array: ");
		arrSize = kb.nextInt();	
		while(arrSize<1) {
			System.out.println("Please input the size of the array: ");
			arrSize = kb.nextInt();	
		}
		// ask the size of array from the user util it's over than 1
		
		arr = getArray(arrSize);
		sortArray(arr);
		kb.close();

	}
	
	public static int[] getArray(int arrSize) {
		
		int[] arr = new int[arrSize];
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)((Math.random())*100);
		}
		System.out.print("The array is: ");
		for(int el : arr) {
			System.out.print(el+" ");
		}	
		System.out.println();
		return arr;
	}
	// fill the array with the random number between 0 to 99, print and return the array
	
	public static void sortArray(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {  
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]){
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	// sort the array in ascending order
				}			
			}
		}
		System.out.print("The sorted array is: ");
		for(int el : arr) {
			System.out.print(el+" ");
		}	
		System.out.println();		
	}
	// print the sorted array

}
