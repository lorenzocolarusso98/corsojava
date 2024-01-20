import java.util.Random;

import srl.neotech.aereoporto.Aereo;
import srl.neotech.aereoporto.Aereoporto;
import srl.neotech.aereoporto.Passeggero;
import srl.neotech.aereoporto.PasseggeroBuisness;
import srl.neotech.aereoporto.PasseggeroFamiliare;
import srl.neotech.aereoporto.PasseggeroTurista;
import srl.neotech.aereoporto.Sesso;
import srl.neotech.aereoporto.StatoPasseggero;

public class App {
    public static void main(String[] args) throws Exception {
    Aereoporto fiumicino=new Aereoporto();
    fiumicino.setSpazioAereo(50);
    Random random=new Random();
    //creazione passeggeri
    for (int x=0;x<8000;x++){
        int tipopasseggero=random.nextInt(3);
        int tiposesso=random.nextInt(1);
        if (tipopasseggero==0) {
            Passeggero passBuisness=new PasseggeroBuisness();
            fiumicino.getPasseggeriInPartenza().add(passBuisness);
            if (tiposesso==0) {
                passBuisness.setSesso(Sesso.FEMMINA);
            }
            else passBuisness.setSesso(Sesso.MASCHIO);
            passBuisness.setEta(random.nextInt(70));
            passBuisness.setStatoPasseggero(StatoPasseggero.DA_IMBARCARE);
        }
        if (tipopasseggero==1) {
            Passeggero passFamiliare=new PasseggeroFamiliare();
            fiumicino.getPasseggeriInPartenza().add(passFamiliare);
            if (tiposesso==0) {
                passFamiliare.setSesso(Sesso.FEMMINA);
            }
            else passFamiliare.setSesso(Sesso.MASCHIO);
            passFamiliare.setEta(random.nextInt(70));
            passFamiliare.setStatoPasseggero(StatoPasseggero.DA_IMBARCARE);
        }
        if (tipopasseggero==2) {
            Passeggero passTurista=new PasseggeroTurista();
            fiumicino.getPasseggeriInPartenza().add(passTurista);
            if (tiposesso==0){
                passTurista.setSesso(Sesso.FEMMINA);
            }
            else passTurista.setSesso(Sesso.MASCHIO);
            passTurista.setEta(random.nextInt(70));
            passTurista.setStatoPasseggero(StatoPasseggero.DA_IMBARCARE);
        }
    }
        //creazione arei in partenza
        for (int y=0;y<50;y++){
            Aereo aereo=new Aereo();
            aereo.setvelocita(random.nextInt(50));
            aereo.setcapienzaPasseggeri(random.nextInt(30));
            fiumicino.getAereiInPartenza().add(aereo);
            aereo.setdistanzaAereoporto(0);
        }
        //creazione aerei in avvicinamento
        for (int k=0;k<200;k++){
        Aereo aereoInArrivo=new Aereo();
        aereoInArrivo.setvelocita(random.nextInt(50));
        aereoInArrivo.setdistanzaAereoporto(random.nextInt(300));
        aereoInArrivo.setcapienzaPasseggeri(random.nextInt(30));
        for (int i=0;i<aereoInArrivo.getcapienzaPasseggeri();i++){
        Passeggero paassegerodentrolaereo=new Passeggero();
        aereoInArrivo.getpasseggeriABordo().add(paassegerodentrolaereo);
        }


        //partenza aerei
        for (int a=0;a<fiumicino.getAereiInPartenza().size();a=a++){
        fiumicino.getAereiInPartenza().get(a).setvelocita(random.nextInt(50));
        for(int b=fiumicino.getAereiInPartenza().get(a).getCapienzaPasseggeri();b>0;b--){
        fiumicino.getAereiInPartenza().get(a).getPasseggeriABordo().add(fiumicino.getPasseggeriInPartenza().get(a));
        }
        fiumicino.partenzaAereo(fiumicino.getAereiInPartenza().get(a));
        //checkin
        if (fiumicino.getAereiInPartenza().get(a).getPasseggeriABordo().get(a).getSesso().equals(Sesso.FEMMINA)) {
            fiumicino.getAereiInPartenza().get(a).getPasseggeriABordo().get(a).setHasFiore(true);
        }
        if (fiumicino.getAereiInPartenza().get(a).getPasseggeriABordo().get(a).getEta()<10){
            fiumicino.getAereiInPartenza().get(a).getPasseggeriABordo().get(a).setHasGiocattolo(true);
        }
            
        }
        

        //arrivo aerei
        for (int b=0;b<fiumicino.getAereiInArrivo().size();b=b++){
        fiumicino.arrivoAereo(fiumicino.getAereiInArrivo().get(b));
        for (int a=fiumicino.getAereiInArrivo().get(b).getPasseggeriABordo().size();a>0;a=a--){
        fiumicino.getAereiInArrivo().get(b).getPasseggeriABordo().get(a).setStatoPasseggero(StatoPasseggero.SBARCATO);
        fiumicino.getAereiInArrivo().get(b).getPasseggeriABordo().get(a).setStatoPasseggero(StatoPasseggero.IN_PREVELAMENTO_BAGAGLI);
        fiumicino.getAereiInArrivo().get(b).getPasseggeriABordo().get(a).setStatoPasseggero(StatoPasseggero.USCITO);
         if (fiumicino.getAereiInArrivo().get(b).getPasseggeriABordo().get(a).getSesso().equals(Sesso.FEMMINA)) {
            fiumicino.getAereiInArrivo().get(b).getPasseggeriABordo().get(a).setHasFiore(true);
        }
        if (fiumicino.getAereiInArrivo().get(b).getPasseggeriABordo().get(a).getEta()<10) {
            fiumicino.getAereiInArrivo().get(b).getPasseggeriABordo().get(a).setHasGiocattolo(true);
        }
        }
       
        
        
        }
        }
        
        
    }
}
