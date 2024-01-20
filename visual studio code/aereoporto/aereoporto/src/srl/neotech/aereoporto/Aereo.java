package srl.neotech.aereoporto;

import java.util.ArrayList;

public class Aereo {
    String costruttore;
    String modello;
    ArrayList<Passeggero>passeggeriABordo=new ArrayList<>();
    Integer capienzaPasseggeri;
    Integer velocita;
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
    Integer distanzaAereoporto;
    
    public String getcostruttore() {
        return costruttore;
    }
    public void setcostruttore(String costruttore) {
        this.costruttore = costruttore;
    }
    public String getmodello() {
        return modello;
    }
    public void setmodello(String modello) {
        this.modello = modello;
    }
    public ArrayList<Passeggero> getpasseggeriABordo() {
        return passeggeriABordo;
    }
    public void setpasseggeriABordo(ArrayList<Passeggero> passeggeriABordo) {
        this.passeggeriABordo = passeggeriABordo;
    }
    public Integer getcapienzaPasseggeri() {
        return capienzaPasseggeri;
    }
    public void setcapienzaPasseggeri(Integer capienzaPasseggeri) {
        this.capienzaPasseggeri = capienzaPasseggeri;
    }
    public Integer getvelocita() {
        return velocita;
    }
    public void setvelocita(Integer velocita) {
        this.velocita = velocita;
    }
    public Integer getdistanzaAereoporto() {
        return distanzaAereoporto;
    }
    public void setdistanzaAereoporto(Integer distanzaAereoporto) {
        this.distanzaAereoporto = distanzaAereoporto;
    }

}

