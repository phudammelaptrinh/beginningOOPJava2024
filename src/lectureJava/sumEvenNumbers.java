package lectureJava;

import java.util.Scanner;

public class sumEvenNumbers {

	public static int sum(int n) {
		int sum = 0;
		for(int i = 1;i<=n;i++) {
			if(i%2 ==0) {
				sum +=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input n=");
		int n = sc.nextInt();
		
		//Check n is soduong ?
		
		if(n<=0) {
			System.out.print("Please input soduong:");
		}
		else {
			int sum = sum(n);
			System.out.println("Sum of even numbers from 1 to "+n+" is "+sum);
		}
	}

}
