package practice01;

import java.util.Scanner;

public class S04_Hipotenus_Metot {
/*
       Hipotenüs hesaplayan bir kod yazınız
       Hipotenös formülü: Karekök(a*a + b*b)
    */
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("A kenarının uzunlugunu girin: ");
    double a=input.nextDouble();

    System.out.println("A kenarının uzunlugunu girin: ");
    double b=input.nextDouble();
    System.out.println("hipotenusHesapla(a,b) = " + hipotenusHesapla(a, b));

}

        public static double hipotenusHesapla(double a,double b){
    double hipotenus=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    return hipotenus;

        }
}
