package practice02;

public class S12_NestedLoop03 {

    public static void main(String[] args) {
        int satir=5;
        for (int bulSatir = 1; bulSatir <=satir ; bulSatir++) {
            for (int j = 1; j <=satir-bulSatir ; j++) {
                System.out.print("* ");
            }

        }
    }
}
