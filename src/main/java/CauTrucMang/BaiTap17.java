/*

 */
package CauTrucMang;

import java.util.Scanner;

public class BaiTap17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] a;
        int n;

        do {
            System.out.print("Nhap so phan tu (1 <= n >= 20): ");
            n = sc.nextInt();
        } while (n <= 0 || n > 20);
        a = new double[n];
        //Nhập mảng
        nhapMang(a, sc);
        //a. Xuất mảng
        xuatMang(a);
        //b. Tính trung bình
        double tb = tinhTrungBinh(a);
        System.out.print("\nTrung bing cua mang: " + tb);
        //c. Tìm min
        double min = timMin(a);
        System.out.print("\nSo nho nhat: " + min);
    }

    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]: ");
            a[i] = sc.nextDouble();
        }
    }

    public static void xuatMang(double[] a) {
        for (double x : a) {
            System.out.print(x + " ");
        }
    }

    public static double tinhTrungBinh(double[] a) {
        double sum = 0;
        for (double x : a) {
            sum += x;
        }
        return sum / a.length;
    }

    public static double timMin(double[] a) {
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
