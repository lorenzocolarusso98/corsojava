import srl.neotech.aereoporto.Aereoporto;
import srl.neotech.aereoporto.Passeggero;

public class App {
    public static void main(String[] args) throws Exception {
    Aereoporto Fiumicino=new Aereoporto();
    Fiumicino.setSpazioAereo(50);
    for (int x=0;x<100;x++){
        Passeggero passeggero=new Passeggero();
        Fiumicino.getPasseggeriInPartenza().add(passeggero);

    }
    



    }
}
