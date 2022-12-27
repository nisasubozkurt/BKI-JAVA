/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bkı;

public class BKI {

    private String isim;
    private int yas;
    private double agirlik; //kg
    private double boy; //m

    public BKI(String isim, int yas, double agirlik, double boy) {
        this.isim = isim;
        this.yas = yas;
        this.agirlik = agirlik;
        this.boy = boy;

    }

    public BKI(String isim, double agirlik, double boy) {
        this(isim, 21, agirlik, boy);
    }

    public double getBKI() {
        double bki = agirlik / (boy * boy);
        return Math.round(bki * 100) / 100.0;
    }

    public String getDurum() {
        double bki = getBKI();
        if (bki < 18.5) {
            return "ZAYIF";
        } else if (bki < 25) {
            return "NORMAL";
        } else if (bki < 30) {
            return "KİLOLU";
        } else {
            return "OBEZ";
        }
    }

    public String getİsim() {
        return isim;

    }

    public int getYas() {
        return yas;
    }

    public double getAgirlik() {
        return agirlik;

    }

    public double getBoy() {
        return boy;
    }

    public static void main(String[] args) {
        BKI bki1 = new BKI("Nisasu Bozkurt", 21, 74, 1.73);
        System.out.println(bki1.getİsim() + " İçin BKİ: " + bki1.getBKI() + " " + bki1.getDurum());

        BKI bki2 = new BKI("Diğer Kişi", 160, 1.70);
        System.out.println(bki2.getİsim() + " İçin BKİ: " + bki2.getBKI() + " " + bki2.getDurum());

    }

}
