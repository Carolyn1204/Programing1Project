package programing1project;

import java.util.Scanner;

public class Question1 {
	
	final static int DIGIT = 1;
	public static void main(String[] args) {
		
		int n1, n2, n3, sum, magicNum;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 3 2-digit numbers: ");
		n1 = kb.nextInt();
		n2 = kb.nextInt();
		n3 = kb.nextInt();
		sum = n1 + n2 +n3;
		// obtain 3 numbers from the user
		
		if(sum%3==0 && sum%5!=0) {
			
			int firstDigitN2 = n2/10;
			if((n1 + n3) >= 100)
				magicNum = firstDigitN2*1000 + n1 + n3; //if the sum of n1 and n3 is over than 100, there will be four digits totally
			else				
				magicNum = firstDigitN2*100 + n1 + n3; //if the sum of n1 and n3 is over than 100, there will be three digits totally
			
		}else if(sum%3!=0 && sum%5==0) {
			
			int lastDigitN2 = n2%10;
			magicNum = (n1+n3) * 10 + lastDigitN2;
			
		}else if(sum%3==0 && sum%5==0) {
			
			magicNum = n2*1000 + n1*10 +1;
			
		}else {
			
			magicNum = n1*10000 + n2*100 + n3;
		}
		
		System.out.println("Your magic number is "+magicNum);
		kb.close();
			

	}

}
