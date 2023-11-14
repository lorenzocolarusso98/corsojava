package srl.neotech.giocofantasy;

public class Zombie extends NonMorto{

    protected  Double moltiplicatoreAttacco=1.5;


    @Override
    public void attacca(Ruolo nemico){
    Double attacco=getForzaAttacco()*moltiplicatoreAttacco;
    System.out.println("Lo zombie ha fatto "+attacco+" di danno");
    nemico.difendi(attacco);
    }
    @Override
    protected void difendi(Double attacco){
    Double difesa=getForzaDifesa()*moltiplicatoreDifesa;
    Double danno=difesa-attacco;
    setStamina(getStamina()+danno);
    System.out.println("Allo zombie rimangono"+getStamina()+"Punti vita");
    }
}
