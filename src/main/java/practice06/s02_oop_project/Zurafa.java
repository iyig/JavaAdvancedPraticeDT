package practice06.s02_oop_project;

public class Zurafa extends Hayvan{
    public Zurafa(String ad, int yas, String tur) {
        super(ad, yas, tur);
    }

    @Override
    public void yemekYer() {
        System.out.println(getYas() + "yaşındaki" + getTur() + " " + getAd() +", ot yiyerek karnını doyurur");
    }

    @Override
    public void sesCikarir() {
        System.out.println(getYas() + "yaşındaki" + getTur() + " " + getAd() +", meyleyerek ses çıkarırı ");
    }
}
