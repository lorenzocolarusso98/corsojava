import java.util.Random;

import srl.neotech.zoo.Animali;
import srl.neotech.zoo.Coccodrillo;
import srl.neotech.zoo.Gabbia;
import srl.neotech.zoo.Ippopotamo;
import srl.neotech.zoo.Leone;
import srl.neotech.zoo.Mammiferi;
import srl.neotech.zoo.Serpente;
import srl.neotech.zoo.Tigri;
import srl.neotech.zoo.Zoo;

public class App {
    public static void main(String[] args) throws Exception {
    Zoo zoo=new Zoo();
    Random ran=new Random();
    Random ran2=new Random();
    Random quantitaLeoni=new Random();
    Integer casualitaGabbiePulite=ran.nextInt(2);
    Integer casualitaGabbieAperte=ran2.nextInt(2);
    for(int x=0;x<7;x++){
    Integer casualitaAnimale=ran.nextInt(6);
    Gabbia gabbia=new Gabbia();
    
    if (casualitaAnimale==0){
    Leone leone=new Leone();
    gabbia.getListaAnimali().add(leone);
    leone.setHaMangiato(null);
    }
    if (casualitaAnimale==1) {
    Ippopotamo ippopotamo=new Ippopotamo();
    gabbia.getListaAnimali().add(ippopotamo);
    }
    if (casualitaAnimale==2) {
        Tigri tigre=new Tigri();
        gabbia.getListaAnimali().add(tigre);
    }
    if (casualitaAnimale==3) {
        Mantide mantide=new Mantide();
        gabbia.getListaAnimali().add(mantide);
    }
    if (casualitaAnimale==4) {
        Serpente serpente=new Serpente();
        gabbia.getListaAnimali().add(serpente);
    }
    if (casualitaAnimale==5) {
        Coccodrillo coccodrillo=new Coccodrillo();
        gabbia.getListaAnimali().add(coccodrillo);
    }
    if (casualitaAnimale==6) {
        Tarantola tarantola=new Tarantola();
        gabbia.getListaAnimali().add(tarantola);
    }
    }
    }
}
