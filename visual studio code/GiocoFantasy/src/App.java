import srl.giocoFantasy.Demone;
import srl.giocoFantasy.Goblin;
import srl.giocoFantasy.Guerriero;
import srl.giocoFantasy.Mago;
import srl.giocoFantasy.Uruk;
import srl.giocoFantasy.Zombie;

public class App {
    public static void main(String[] args) throws Exception {
        Goblin goblin=new Goblin();
        goblin.setStamina(100.5);
        goblin.setForzaAttacco(40.5);
        goblin.setForzaDifesa(10.5);
        

        Uruk uruk=new Uruk();
        uruk.setStamina(150.0);
        uruk.setForzaAttacco(50.0);
        uruk.setForzaDifesa(25.5);

        Zombie zombie=new Zombie();
        zombie.setStamina(40.5);
        zombie.setForzaAttacco(30.5);
        zombie.setForzaDifesa(7.5);

        Demone demone=new Demone();
        demone.setStamina(130.5);
        demone.setForzaAttacco(45.5);
        demone.setForzaDifesa(20.0);
        
        Mago mago=new Mago();
        mago.setStamina(70.5);
        mago.setForzaAttacco(35.5);
        mago.setForzaDifesa(25.5);

        Guerriero guerriero=new Guerriero();
        guerriero.setStamina(85.5);
        guerriero.setForzaAttacco(40.5);
        guerriero.setForzaDifesa(20.0);
        System.out.println(goblin.getDifesaFinale());
        System.out.println(1);
    }
}
