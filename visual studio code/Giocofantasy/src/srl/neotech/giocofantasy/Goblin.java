package srl.neotech.giocofantasy;

public class Goblin extends Orco{
    protected  Double moltiplicatoreAttacco=1.3;

    @Override
    public void attacca(Ruolo nemico){
    Double attacco=getForzaAttacco()*moltiplicatoreAttacco;
    System.out.println("Il goblin ha fatto "+attacco+" di danno");
    nemico.difendi(attacco);
    }
    @Override
    protected void difendi(Double attacco){
    Double difesa=getForzaDifesa()*moltiplicatoreDifesa;
    Double danno=difesa-attacco;
    setStamina(getStamina()+danno);
    System.out.println("Al goblin rimangono"+getStamina()+"punti vita");
    }

}
