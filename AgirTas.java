public class AgirTas extends Tas{
    int sicaklik;
    AgirTas(){
    }
    AgirTas(int dayaniklilik, int seviye, int katilik,int sicaklik){
        super(dayaniklilik,seviye,katilik);
        this.sicaklik = sicaklik;
    }
    @Override
    public void nesnePuaniGoster() {
        super.nesnePuaniGoster();
        System.out.println("Sıcaklık: "+sicaklik);
    }
}
