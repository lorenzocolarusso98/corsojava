package srl.neotech.giocofantasy;

public class Uruk extends Orco{
    public String nome;
    protected  Double moltiplicatoreAttacco=1.3;
    @Override
    public void attacca(Ruolo nemico){
    Double attacco=getForzaAttacco()*moltiplicatoreAttacco;
    System.out.println("L'uruk ha fatto "+attacco+" di danno");
    nemico.difendi(attacco);
    }
    @Override
    protected void difendi(Double attacco){
    Double difesa=getForzaDifesa()*moltiplicatoreDifesa;
    Double danno=difesa-attacco;
    setStamina(getStamina()+danno);
    System.out.println("All'uruk rimangono"+getStamina()+"punti vita");
    }
    @Override
    public String toString() {
        return "Uruk [nome=" + nome + ", moltiplicatoreAttacco=" + moltiplicatoreAttacco + "]";
    }
}
