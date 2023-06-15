package practice04;

import java.time.LocalDate;
import java.util.Scanner;

public class S01_DateTime_Gunler {
/*
        Kullanıcıdan alınan bir tarihin haftanın hangi gününe denk geldiğini bulan bir program yazmanız isteniyor.
        Kullanıcıdan yıl, ay ve gün bilgilerini alarak, tarihin hangi gün olduğunu bulan bir Java programı yazın.
        Sonuç olarak, tarihin haftanın hangi gününe denk geldiğini Türkçe olarak ekrana yazdırın.
    */
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("Yıl,Ay ve Gün bilgilerini sayisal olarak giriniz:");
           int yıl=input.nextInt();
           int ay=input.nextInt();
           int gun=input.nextInt();
           LocalDate tarih= LocalDate.of(yıl,ay,gun);

           String haftaninGunu = tarih.getDayOfWeek().name();

           switch (haftaninGunu){
               case "MONDAY":
                   System.out.println("Girdiğiniz tarih PAZARTESİ gününe denk geliyor.");
                   break;
               case "TUESDAY":
                   System.out.println("Girdiğiniz tarih SALI gününe denk geliyor.");
                   break;
               case "WEDNESDAY":
                   System.out.println("Girdiğiniz tarih ÇARŞAMBA gününe denk geliyor.");
                   break;
               case "THURSDAY":
                   System.out.println("Girdiğiniz tarih PERŞEMBE gününe denk geliyor.");
                   break;
               case "FRIDAY":
                   System.out.println("Girdiğiniz tarih CUMA gününe denk geliyor.");
                   break;
               case "SATURDAY":
                   System.out.println("Girdiğiniz tarih CUMARTESİ gününe denk geliyor.");
                   break;
               case "SUNDAY":
                   System.out.println("Girdiğiniz tarih PAZAR gününe denk geliyor.");
                   break;
           }
       }

}

