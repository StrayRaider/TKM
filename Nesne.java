abstract class Nesne {
    public int dayaniklilik;
    public int seviye;

    Nesne() {
        dayaniklilik = 0;
        seviye = 0;
    };

    Nesne(int dayaniklilik, int seviye) {
        this.dayaniklilik = dayaniklilik;
        this.seviye = seviye;
    };

    abstract public void nesnePuaniGoster();

    abstract public void etkiHesapla();

    abstract public void durumGuncelle();
}