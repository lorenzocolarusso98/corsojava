package srl.neotech.zoo;

import java.util.ArrayList;

public class Gabbia {
    Boolean isPulita;
    Boolean isChiusa;
    ArrayList<Animali> listaAnimali=new ArrayList<>();
    public Boolean getIsPulita() {
        return isPulita;
    }
    public void setIsPulita(Boolean isPulita) {
        this.isPulita = isPulita;
    }
    public Boolean getIsChiusa() {
        return isChiusa;
    }
    public void setIsChiusa(Boolean isChiusa) {
        this.isChiusa = isChiusa;
    }
    public ArrayList<Animali> getListaAnimali() {
        return listaAnimali;
    }
    public void setListaAnimali(ArrayList<Animali> listaAnimali) {
        this.listaAnimali = listaAnimali;
    }
}
