/*

 */
package CauTrucMang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaiTap19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int n, x;

        do {
            System.out.print("Nhap so phan tu (1 <= n >= 20): ");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        a = new int[n];
        //Nhập mảng
        phatSinhMang(a);
        //a. Xuất mảng
        System.out.println("\nXuat mang ra man hinh: ");
        xuatMang(a);
        System.out.println("\nMang sau sap xep: ");
        sapXepTang(a);
        xuatMang(a);
        //b. 
        System.out.print("\nNhap uoc so: ");
        x = sc.nextInt();
        lietKeUocSo(a, x);
    }

    public static void phatSinhMang(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = rd.nextInt(100);
        }
    }

    public static void xuatMang(int[] a) {
        System.out.print(Arrays.toString(a));
    }

    public static void sapXepTang(int[] a) {
        Arrays.sort(a);
    }

    public static void lietKeUocSo(int[] a, int x) {
        for (int item : a) {
            if (x % item == 0) {
                System.out.print(item + ", ");
            }
        }
    }
}
