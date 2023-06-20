package programing1project;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		int row, col, disNum;
		boolean flag = false;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter two positive integers: ");
		row = kb.nextInt();
		col = kb.nextInt();
		while(row<1 || col<1) {
			System.out.println("Please enter two positive integers: ");
			row = kb.nextInt();
			col = kb.nextInt();
		}
		// ask two integers from the user utill they are both over than 1
		
		int[][] arr = new int[row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				arr[i][j] = (int)((Math.random())*100+1);
			}
		}
		// fill the array with the random number between 1 to 100
		
		System.out.println("The multdimensional array: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				System.out.printf("%-4d",arr[i][j]);
			}
			System.out.println();
		}
		// print the array
		
		System.out.println("Which number want to disappear: ");
		disNum = kb.nextInt();
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				
				if(arr[i][j] == disNum){
					arr[i][j] = 0;
					flag = true;
				}
			}
		}
		// replace the number that the user want disappear with 0
		// if the number exists, set flag as true
		
		if(flag) {
			
			System.out.println("The new array: ");
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					
					System.out.printf("%-4d",arr[i][j]);
				}
				System.out.println();
			}
		}
		else			
			System.out.println("Sorry, can't find this value!");		
		// if the number exists, print the new array, otherwise print error message
		
		kb.close();
	}

}
