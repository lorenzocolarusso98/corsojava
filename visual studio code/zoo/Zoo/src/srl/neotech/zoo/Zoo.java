package srl.neotech.zoo;

import java.util.ArrayList;

public class Zoo {
    String nome="bioparco";
    String stato="chiuso";
    ArrayList<Gabbia>listagabbie=new ArrayList<>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getStato() {
        return stato;
    }
    public void setStato(String stato) {
        this.stato = stato;
    }
    public ArrayList<Gabbia> getListagabbie() {
        return listagabbie;
    }
    public void setListagabbie(ArrayList<Gabbia> listagabbie) {
        this.listagabbie = listagabbie;
    }
    
}
