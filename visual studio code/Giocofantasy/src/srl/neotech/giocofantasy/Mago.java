package srl.neotech.giocofantasy;

public class Mago extends Umano{
    public String nome="mago";
    protected  Double moltiplicatoreAttacco=1.5;
    @Override
    public void attacca(Ruolo nemico){
    Double attacco=getForzaAttacco()*moltiplicatoreAttacco;
    System.out.println("Il mago ha fatto "+attacco+" di danno");
    nemico.difendi(attacco);
    }
    @Override
    protected void difendi(Double attacco){
    Double difesa=getForzaDifesa()*moltiplicatoreDifesa;
    Double danno=difesa-attacco;
    setStamina(getStamina()+danno);
    System.out.println("Al mago rimangono"+getStamina()+"Punti vita");
    }
    @Override
    public String toString() {
        return "Mago [nome=" + nome + ", moltiplicatoreAttacco=" + moltiplicatoreAttacco + "]";
    }
}
