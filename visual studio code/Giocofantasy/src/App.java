import java.util.ArrayList;
import java.util.Random;
import srl.neotech.giocofantasy.Demone;
import srl.neotech.giocofantasy.Goblin;
import srl.neotech.giocofantasy.Guerriero;
import srl.neotech.giocofantasy.Mago;
import srl.neotech.giocofantasy.Ruolo;
import srl.neotech.giocofantasy.Uruk;
import srl.neotech.giocofantasy.Zombie;

public class App {
    public static void main(String[] args) throws Exception {
    Random r=new Random();
    Integer tiporuolo=r.nextInt(6 - 1 + 1) + 1;
    Integer tiporuolo2=r.nextInt(6 - 1 + 1) + 1;
    while (tiporuolo==tiporuolo2) {
        tiporuolo2=r.nextInt(6 - 1 + 1) + 1;
    }
    ArrayList<Ruolo> pirmaArmata=new ArrayList<>();
    Ruolo p1=null;
    int risultato=2;
    
    for (int i=0;i<10;i++){
    if (tiporuolo==1) {
        p1=new Goblin();
        p1.setStamina(r.nextDouble(150.0));
        p1.setForzaAttacco(r.nextDouble(25.0));
        p1.setForzaDifesa(r.nextDouble(15.0));
        pirmaArmata.add(p1);
    }
    else if (tiporuolo==2) {
        p1=new Uruk();
        p1.setStamina(r.nextDouble(150.0));
        p1.setForzaAttacco(r.nextDouble(25.0));
        p1.setForzaDifesa(r.nextDouble(15.0));
        pirmaArmata.add(p1);
    }
    else if (tiporuolo==3) {
        p1=new Zombie();
        p1.setStamina(r.nextDouble(150.0));
        p1.setForzaAttacco(r.nextDouble(25.0));
        p1.setForzaDifesa(r.nextDouble(15.0));
        pirmaArmata.add(p1);
    }
    else if (tiporuolo==4) {
        p1=new Demone();
        p1.setStamina(r.nextDouble(150.0));
        p1.setForzaAttacco(r.nextDouble(25.0));
        p1.setForzaDifesa(r.nextDouble(15.0));
        pirmaArmata.add(p1);
    }
    else if (tiporuolo==5) {
        p1=new Guerriero();
        p1.setStamina(r.nextDouble(150.0));
        p1.setForzaAttacco(r.nextDouble(25.0));
        p1.setForzaDifesa(r.nextDouble(15.0));
        pirmaArmata.add(p1);
    }
    else if (tiporuolo==6) {
        p1=new Mago();
        p1.setStamina(r.nextDouble(150.0));
        p1.setForzaAttacco(r.nextDouble(25.0));
        p1.setForzaDifesa(r.nextDouble(15.0));
        pirmaArmata.add(p1);
    }
    }
    //Creazione secondo giocatore
    ArrayList<Ruolo> secondaArmata=new ArrayList<>();
    Ruolo p2=null;
    for (int i=0;i<10;i++){
    if (tiporuolo2==1) {
        p2=new Goblin();
        p2.setStamina(r.nextDouble(130.0));
        p2.setForzaAttacco(r.nextDouble(20.0));
        p2.setForzaDifesa(r.nextDouble(20.0));
        secondaArmata.add(p2);
    }
    else if (tiporuolo2==2) {
        p2=new Uruk();
        p2.setStamina(r.nextDouble(130.0));
        p2.setForzaAttacco(r.nextDouble(20.0));
        p2.setForzaDifesa(r.nextDouble(20.0));
        secondaArmata.add(p2);
    }
    else if (tiporuolo2==3) {
        p2=new Zombie();
        p2.setStamina(r.nextDouble(130.0));
        p2.setForzaAttacco(r.nextDouble(20.0));
        p2.setForzaDifesa(r.nextDouble(20.0));
        secondaArmata.add(p2);
    }
    else if (tiporuolo2==4) {
        p2=new Demone();
        p2.setStamina(r.nextDouble(130.0));
        p2.setForzaAttacco(r.nextDouble(20.0));
        p2.setForzaDifesa(r.nextDouble(20.0));
        secondaArmata.add(p2);
    }
    else if (tiporuolo2==5) {
        p2=new Guerriero();
        p2.setStamina(r.nextDouble(130.0));
        p2.setForzaAttacco(r.nextDouble(20.0));
        p2.setForzaDifesa(r.nextDouble(20.0));
        secondaArmata.add(p2);
    }
    else if (tiporuolo2==6) {
        p2=new Mago();
        p2.setStamina(r.nextDouble(130.0));
        p2.setForzaAttacco(r.nextDouble(20.0));
        p2.setForzaDifesa(r.nextDouble(20.0));
        secondaArmata.add(p2);
    }
    }
       for(int i=0;i<10;i++){
        System.out.println("---------------------------------------------scontro numero--------------------------------------------------------"+ i);
      while (pirmaArmata.get(i).getStamina()>0 && secondaArmata.get(i).getStamina()>0) {
        pirmaArmata.get(i).attacca(secondaArmata.get(i));
        System.out.println("----------");
        secondaArmata.get(i).attacca(secondaArmata.get(i));
        System.out.println("----------");
      }
      int m=7;
      
    }
    }
}
