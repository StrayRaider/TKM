abstract class Oyuncu {
    public int OyuncuID;
    public String OyuncuAdi;
    public int skor;
    Oyuncu(){
    }
    Oyuncu(int OyuncuID,String OyuncuAdi,int skor){
        this.OyuncuID = OyuncuID;
        this.OyuncuAdi = OyuncuAdi;
        this.skor = skor;
    }
    void skorGoster(){};
    void nesneSec(){}
}