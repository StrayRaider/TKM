public class Tas extends Nesne {
    public int katilik;

    Tas() {
    };

    Tas(int dayaniklilik, int seviye, int katilik) {
        super(dayaniklilik, seviye);
        this.katilik = katilik;
    }

    @Override
    public void nesnePuaniGoster() {
        System.out.println("Seviye: " + seviye);
        System.out.println("Dayanıklılık: " + dayaniklilik);
        System.out.println("Katılık: " + katilik);
    }

    @Override
    public void etkiHesapla() {
    }

    @Override
    public void durumGuncelle() {

    }
}
