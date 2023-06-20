package programing1project;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		int joker, number, outPut;
		Scanner kb = new Scanner(System.in);
		System.out.println("Joker: ");
		joker = kb.nextInt();
		System.out.println("Number: ");
		number = kb.nextInt();
		//obtain joker number and how many number the user want to put
		
		System.out.println("Enter numbers:");
		int[] num = new int[number];
		for(int i=0; i<num.length; i++) {
			num[i] = kb.nextInt();
		}		
		// obtain numbers from the user

		for(int j=0; j<num.length; j++) {
			
			if(num[j]<joker)
				outPut = num[j];  // outPut = 0;
			else {
				outPut = num[j];
				while(outPut>=joker) { // deduct that number until getting number less than joker 
					outPut -= joker;
				}
			}
			System.out.print(outPut+" ");
		}
		kb.close();

	}

}
