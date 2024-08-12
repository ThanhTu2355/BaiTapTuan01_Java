/*
    TINH TONG TU 1 DEN N
 */
package CauTrucLap;

import java.util.Scanner;

public class BaiTap08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum;
        System.out.print("Nhap so ban muon: ");
        n = sc.nextInt();
        sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

}
