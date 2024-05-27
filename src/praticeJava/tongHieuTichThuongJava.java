package praticeJava;

import java.util.Scanner;

public class tongHieuTichThuongJava {

	public static boolean kiemtra(String str)
	{
		try {
			Integer.parseInt(str);
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
		
	}
	
	public static int nhap(Scanner sc, String prompt) {
		while(true) {
			System.out.print(prompt);
			String input = sc.nextLine();
			if(kiemtra(input)) {
				return Integer.parseInt(input);
			}
			else {
				System.out.print("Vui long nhap du lieu phu hop");
			}
		}
	}
	
	public static char chonpheptinh(Scanner sc) {
		while(true) {
			System.out.print("Nhap phep tinh (+,-,*,/):");
			String input = sc.nextLine();
			if(input.length()== 1 && "+-*/".contains(input)) {
				return input.charAt(0);
			}
			else {
				System.out.println("Vui long chon cac phep tinh tren !");
			}
		}
	}
	public static void tinhtoan(int num1, int num2, char operation) {
		switch(operation){
			case '+':
				System.out.println("Ket qua cong la :"+(num1+num2));
			break;
			
			case '-':
				System.out.println("Ket qua tru la :"+(num1-num2));
			break;
			
			case '*':
				System.out.println("Ket qua nhan la :"+(num1*num2));
			break;
			
			case '/':
				if(num2 !=0) {
					System.out.println("Ket qua chia la :"+ ((double) num1 /num2));
				}
				else {
					System.out.println("Khong the chia dc 0");
				}
				break;
			default:
				System.out.println("Phep tinh khong hop le!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num1= nhap(sc,"Nhap vao so 1= ");
		int num2= nhap(sc,"Nhap vao so 2= ");
		char operation = chonpheptinh(sc);
		tinhtoan(num1,num2,operation);
		sc.close();
		
	}

}
