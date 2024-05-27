package lectureJava;

import java.util.Scanner;

public class divideIntoSNT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Input of first number:");
		int num1 = sc.nextInt();
		System.out.print("Input of second number:");
		int num2 = sc.nextInt();
		int result = num1/num2;
		int result2 = num1%num2;
		System.out.println("Result 1 = "+ result);
		System.out.println("Result 1 = "+ result2);
	}

}
