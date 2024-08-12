/*

 */
package CauTrucMang;

import java.util.Scanner;

public class BaiTap16 {

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
        //b. Tính tổng mảng
        int tong = tinhTongMang(a);
        System.out.print("\nTong gia tri cua mang: " + tong);

        //c. Dem so duong le
        int dem = demSoDuongLe(a);
        System.out.print("\nSo duong le cua mang: " + dem);

        //d. Tim so lon nhat
        int max = timMax(a);
        System.out.print("\nSo lon nhat: " + max);
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

    public static int tinhTongMang(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum = sum + x;
        }
        return sum;
    }

    public static int demSoDuongLe(int[] a) {
        int dem = 0;
        for (int x : a) {
            if (x > 0 && x % 2 != 0) {
                dem++;
            }
        }
        return dem;
    }

    public static int timMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
