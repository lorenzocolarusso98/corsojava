package srl.neotech.giocofantasy;

public class Demone extends NonMorto{
    public String nome="demone";
    protected  Double moltiplicatoreAttacco=1.5;
    @Override
    public void attacca(Ruolo nemico){
    Double attacco=getForzaAttacco()*moltiplicatoreAttacco;
    System.out.println("Il demone ha fatto "+attacco+" di danno");
    nemico.difendi(attacco);
    }
    @Override
    protected void difendi(Double attacco){
    Double difesa=getForzaDifesa()*moltiplicatoreDifesa;
    Double danno=difesa-attacco;
    setStamina(getStamina()+danno);
    System.out.println("Al demone rimangono"+getStamina()+"Punti vita");
    }
    @Override
    public String toString() {
        return "Demone [nome=" + nome + ", moltiplicatoreAttacco=" + moltiplicatoreAttacco + "]";
    }
    
}
