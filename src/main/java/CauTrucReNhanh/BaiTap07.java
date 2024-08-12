/*
    IN RA SO NGAY CUA THANG
 */
package CauTrucReNhanh;

import java.util.Scanner;

public class BaiTap07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang, nam;
        String kq = null;
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        System.out.print("Nhap nam: ");
        nam = sc.nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                kq = "Thang " + thang + " co 31 ngay";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                kq = "Thang " + thang + " co 30 ngay";
                break;
            case 2:
                if (nam % 4 == 0) {
                    kq = "Thang " + thang + " co 29 ngay";
                } else {
                    kq = "Thang " + thang + " co 28 ngay";
                }
        }
        System.out.print(kq);
    }
}
