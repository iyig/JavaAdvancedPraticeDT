package practice01;

import java.util.Scanner;

public class S09_IfStatement_DikUcgen {

  /*
        Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Not: Bir üçgenin dik olduğunu anlamak için a^2 + b^2 = c^2 pisagor bağlantısından yararlanabilirsiniz)
    */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("A uzunluğunu girin");
        double a = input.nextDouble();
        System.out.println("B uzunlugunu girinin");
        double b = input.nextDouble();
        System.out.println("C uzunlugunu girin");
        double c = input.nextDouble();

        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println("Bu bir dik ücgendir");

        }
     if (Math.sqrt( Math.pow(a,2)+Math.pow(b,2)) == Math.sqrt(Math.pow(c,2))){

         System.out.println("Bu bir dik ücgendir");

     }else{
         System.out.println("dik ücgen degil");
     }


    }


}
