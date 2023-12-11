package srl.neotech.aereoporto;

import java.util.ArrayList;

public class Aereo {
    String costruttore;
    String modello;
    ArrayList<Passeggero>passeggeriABordo=new ArrayList<>();
    Integer capienzaPasseggeri;
    Integer velocita;
    Integer distanzaAereoporto;
    Enum statoAereoprto;
    public String getCostruttore() {
        return costruttore;
    }
    public void setCostruttore(String costruttore) {
        this.costruttore = costruttore;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public ArrayList<Passeggero> getPasseggeriABordo() {
        return passeggeriABordo;
    }
    public void setPasseggeriABordo(ArrayList<Passeggero> passeggeriABordo) {
        this.passeggeriABordo = passeggeriABordo;
    }
    public Integer getCapienzaPasseggeri() {
        return capienzaPasseggeri;
    }
    public void setCapienzaPasseggeri(Integer capienzaPasseggeri) {
        this.capienzaPasseggeri = capienzaPasseggeri;
    }
    public Integer getVelocita() {
        return velocita;
    }
    public void setVelocita(Integer velocita) {
        this.velocita = velocita;
    }
    public Integer getDistanzaAereoporto() {
        return distanzaAereoporto;
    }
    public void setDistanzaAereoporto(Integer distanzaAereoporto) {
        this.distanzaAereoporto = distanzaAereoporto;
    }
    public Enum getStatoAereoprto() {
        return statoAereoprto;
    }
    public void setStatoAereoprto(Enum statoAereoprto) {
        this.statoAereoprto = statoAereoprto;
    }
}
