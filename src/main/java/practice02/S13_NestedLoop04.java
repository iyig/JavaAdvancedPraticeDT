package practice02;

import java.util.Scanner;

public class S13_NestedLoop04 {
    public static void main(String[] args) {
/*
a
a b
a b c
a b c d
a b c d e

 */


      Scanner input=new Scanner(System.in);
        System.out.println("ilerlemek istedigimiz harfi giriniz");
        char str=input.next().charAt(0);

        for ( char i = 'a';  i <=str; i++) {
            for (char j = 'a'; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }

}
