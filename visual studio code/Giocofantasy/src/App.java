import srl.neotech.giocofantasy.Goblin;
import srl.neotech.giocofantasy.Zombie;

public class App {
    public static void main(String[] args) throws Exception {
    Goblin goblin=new Goblin();
    goblin.setStamina(200.0);
    goblin.setForzaAttacco(25.0);
    goblin.setForzaDifesa(5.0);
    
    Zombie zombie=new Zombie();
    zombie.setStamina(100.5);
    zombie.setForzaAttacco(20.0);
    zombie.setForzaDifesa(15.0);

    while (goblin.getStamina()>0 && zombie.getStamina()>0){
    goblin.attacca(zombie);
    zombie.attacca(goblin);
    }
if (goblin.getStamina()<0) {
    System.out.println("Lo zombie ha vinto");
}
else System.out.println("Il goblin ha vinto");

}
}