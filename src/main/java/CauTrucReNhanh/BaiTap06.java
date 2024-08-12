/*
    NHAP 2 SO NGUYEN VA 1 PHEP TOAN
 */
package CauTrucReNhanh;

import java.util.Scanner;

public class BaiTap06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        char pheptoan;
        System.out.print("Nhap vao so thu nhat: ");
        a = sc.nextInt();
        System.out.print("Nhap vao so thu hai: ");
        b = sc.nextInt();
        System.out.print("Nhap vao phep toan: ");
        pheptoan = sc.next().charAt(0);

        switch (pheptoan) {
            case '+':
                System.out.print("Ket qua: " + (a + b));
                break;
            case '-':
                System.out.print("Ket qua: " + (a - b));
                break;
            case '*':
                System.out.print("Ket qua: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.print("Ket qua: " + (a / b));
                } else {
                    System.out.print("Khong the chia vi khong khac 0 ");
                }
                break;
        }
    }
}
