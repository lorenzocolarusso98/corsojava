package srl.neotech.zoo;

public class Animali {
    Boolean haMangiato=false;
    public void mangia(){
        System.out.println("animale mangia");
    }
    public Boolean getHaMangiato() {
        return haMangiato;
    }
    public void setHaMangiato(Boolean haMangiato) {
        this.haMangiato = haMangiato;
    }
}
