/*
    SO CHAN HAY SO LE
 */
package CauTrucReNhanh;

import java.util.Scanner;


public class BaiTap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String kq;
        System.out.print("Nhap mot so ban muon: ");
        number = sc.nextInt();
        if(number % 2 == 0){
            kq = "So ban vua nhap la so chan";
        }else{
            kq = "So ban vua nhap la so le";
        }
        System.out.print(kq);
    }
}
