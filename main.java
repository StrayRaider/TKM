import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Tas myRock = new Tas(1,13,4);
        myRock.nesnePuaniGoster();
        AgirTas myAgirTas = new AgirTas(3, 6, 7, 30);
        myAgirTas.nesnePuaniGoster();
        ArrayList listem = new ArrayList<Object>();
        listem.add(myRock.dayaniklilik);
        listem.add(myAgirTas.seviye);
        listem.add(myRock);
        System.out.println(listem);
    }
    
}