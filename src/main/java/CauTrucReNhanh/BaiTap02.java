/*
    XEP LOAI HOC LUC
 */
package CauTrucReNhanh;

import java.util.Scanner;


public class BaiTap02 {
    public static void main(String[] args) {
        double toan, van, anh, dtb;
        String kq;
        Scanner sc =new Scanner(System.in);
        //Nhap diem
        System.out.print("Nhap diem mon Toan: ");
        toan = sc.nextDouble();
        System.out.print("Nhap diem mon Van: ");
        van = sc.nextDouble();
        System.out.print("Nhap diem mon Anh: ");
        anh = sc.nextDouble();
        //Tinh diem trung binh
        dtb = (toan + van + anh) / 3;
        //Xep loai hoc luc
        if(dtb < 4){
            kq = "Yeu";
        }else if(dtb  < 6.5){
            kq = "Trung Binh";
        }else if(dtb < 8){
            kq = "Kha";
        }else{
            kq = "Gioi";
        }
        //Xuat ket qua
        System.out.println(kq);
    }
}
