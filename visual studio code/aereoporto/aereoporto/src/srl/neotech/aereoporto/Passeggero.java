package srl.neotech.aereoporto;

public class Passeggero {
    enum StatoPasseggero;
    Enum sesso;
    Integer eta;
    Boolean hasGiocattolo;
    public Enum getSesso() {
        return sesso;
    }
    public void setSesso(Enum sesso) {
        this.sesso = sesso;
    }
    public Integer getEta() {
        return eta;
    }
    public void setEta(Integer eta) {
        this.eta = eta;
    }
    public Boolean getHasGiocattolo() {
        return hasGiocattolo;
    }
    public void setHasGiocattolo(Boolean hasGiocattolo) {
        this.hasGiocattolo = hasGiocattolo;
    }
}
