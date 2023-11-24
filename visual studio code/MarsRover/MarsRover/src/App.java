import java.util.ArrayList;
import java.util.StringTokenizer;
import srl.neotech.marsrover.Passo;
import srl.neotech.marsrover.Rover;
public class App {
    public static void main(String[] args) throws Exception {
    String percorso="A:1/S/A:4/D/A:3/S/A:1/D/A:2/S/A:1";
    ArrayList<Passo>passiLista=new ArrayList<>();
    Rover rover=new Rover();
    StringTokenizer numeroMovimenti=new StringTokenizer(percorso, "/");
   while (numeroMovimenti.hasMoreTokens()) {
     String passiPercorso=numeroMovimenti.nextToken();
     if (passiPercorso.startsWith("S")) {
     Passo passoSx=new Passo();
     passoSx.setTipo("sinistra");
     passiLista.add(passoSx);
     rover.ruotaSX();
     }
     else if (passiPercorso.startsWith("D")) {
        Passo passoDx=new Passo();
        passoDx.setTipo("destra");
        passiLista.add(passoDx);
        rover.ruotaDX();
     }
     else if (passiPercorso.startsWith("A")) {
        String [] numeroAvanti=passiPercorso.split(":");
        Passo passoAv=new Passo();
        passoAv.setTipo("avanti");
        passoAv.setNumeroStep(Integer.valueOf(numeroAvanti[1]));
        passiLista.add(passoAv);
        Integer numA=Integer.valueOf(numeroAvanti[1]);
        for (Integer j=0;j<numA;j++){
            rover.avanza();
        }
    }
    }
    }
}