package practice02;

import java.util.Scanner;

public class S10_NestedLoop01 {
    public static void main(String[] args) {
/*
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *



 */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir satir sayisi giriniz");
      int satir=  input.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = satir; i >=1; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}
