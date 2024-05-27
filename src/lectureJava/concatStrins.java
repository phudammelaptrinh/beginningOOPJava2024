package lectureJava;

import java.util.Scanner;

public class concatStrins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input of string 1=");
		String str1 = sc.nextLine();
		System.out.print("Input o string 2=");
		String str2 = sc.nextLine();
		//Noi 2 chuoi lai voi nhau 
		String result = str1 + str2;
		//In ra ket qua 
		System.out.println("Result by concatting string= "+result);
		
	}

}
