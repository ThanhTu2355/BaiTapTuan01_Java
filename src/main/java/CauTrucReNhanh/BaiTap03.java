/*
    IN RA SO NHO NHAT
 */
package CauTrucReNhanh;

import java.util.Scanner;


public class BaiTap03 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        //Nhap 3 so tu ban phim
        System.out.print("Nhap so thu nhat: ");
        a = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        b = sc.nextDouble();
        System.out.print("Nhap so thu ba: ");
        c = sc.nextDouble();
        //Tim so nho nhat
        double min =a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        System.out.println("So nho nhat la: " + min);
    }
}
