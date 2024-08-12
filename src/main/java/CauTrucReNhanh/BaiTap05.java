/*
    TINH TIEN TAXI
 */
package CauTrucReNhanh;

import java.util.Scanner;


public class BaiTap05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, thanhtien = 0;
        System.out.print("Nhap so km: ");
        km = sc.nextDouble();
        //Tinh tien
        if(km < 1){
            thanhtien = 15000;
        }else if(km <= 5){
            thanhtien = 15000 + (km - 1)*13500;
        }else if(km >= 6){
            thanhtien = 15000 + 4*13500 + (km - 5)*11000;
        }
        //Giam gia khi km > 120
        if(km > 120){
            thanhtien = thanhtien * 0.9;
        }
        System.out.println(thanhtien);
    }
}
