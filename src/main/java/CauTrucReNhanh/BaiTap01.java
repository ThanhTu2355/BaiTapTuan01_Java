/*
    GIAI PHUONG TRINH BAC NHAT
 */
package CauTrucReNhanh;

import java.util.Scanner;


public class BaiTap01 {
    public static void main(String[] args) {
        double a, b;
        String kq;
        Scanner sc = new Scanner(System.in);
        //Nhap he so a, b
        System.out.print("Nhap he so a: ");
        a = sc.nextDouble();
        System.out.print("Nhap he so b: ");
        b = sc.nextDouble();
        //Giai phuong trinh
        if(a==0){
            if(b==0){
                kq="Phuong trinh vo so nghiem";
            }else {
                kq="Phuong trinh vo nghiem";
            }
        }else{
            kq="Phuong trinh co nghem la " +(-b/a);
        }
        //Xuat ket qua
        System.out.println(kq);
    }
}
