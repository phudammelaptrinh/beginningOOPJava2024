package lectureJava;

import java.util.Scanner;

public class sumEvenNumbersInArr {

    // Hàm tính tổng các số chẵn trong mảng
    public static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập kích thước của mảng
        System.out.print("Input n: ");
        int n = sc.nextInt();

        // Khởi tạo mảng với kích thước n
        int[] array = new int[n];

        // Yêu cầu người dùng nhập các phần tử của mảng
        System.out.println("Input values in n:");
        for (int i = 0; i < n; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        // Gọi hàm sum để tính tổng các số chẵn trong mảng
        int sum = sum(array);

        // In ra kết quả
        System.out.println("Ketqua: " + sum);
    }
}
