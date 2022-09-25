package first;

import java.util.Scanner;

public class ciftSayilariBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int llong =0;
        double total=0;
        System.out.print("İşlem yapmak istediğiniz sayıyı giriniz:");
        int sayi = input.nextInt();
        byte i =1;
        while(i<=sayi) {
            if(i%3==0 && i%4==0) {
                total += i;
            }
            llong++;
            i++;
        }
        System.out.print("Ortalama:"+(total/llong));
    }
}
