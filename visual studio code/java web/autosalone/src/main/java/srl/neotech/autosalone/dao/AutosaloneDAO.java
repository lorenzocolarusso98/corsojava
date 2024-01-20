package srl.neotech.autosalone.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import srl.neotech.autosalone.Macchina;

@Component
public class AutosaloneDAO {

    ArrayList<Macchina>listaMacchine=new ArrayList<>();

    public ArrayList<Macchina> getListaMacchine() {
        return listaMacchine;
    }

    public void setListaMacchine(ArrayList<Macchina> listaMacchine) {
        this.listaMacchine = listaMacchine;
    }
   
}
