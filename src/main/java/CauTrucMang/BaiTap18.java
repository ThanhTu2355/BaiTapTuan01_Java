/*

 */
package CauTrucMang;

import java.util.Scanner;


public class BaiTap18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a;
        int n;

        do {
            System.out.print("Nhap so phan tu (1 <= n >= 20): ");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        a = new int[n];
        //Nhập mảng
        nhapMang(a, sc);
        //a. Xuất mảng
        xuatMang(a);
        //b. Liệt kê không phải số nguyên tố
    }
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }

    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    public static void lietKeKhongPhaiSNT(int[] a) {
        for (int x : a) {
            
        }
    }
}
