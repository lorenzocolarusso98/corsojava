package srl.neotech.aereoporto;

public class Passeggero {
    StatoPasseggero statoPasseggero;
    Sesso sesso;
    Integer eta;
    Boolean hasGiocattolo;
    Boolean hasFiore;
    public Sesso getSesso() {
        return sesso;
    }
    public StatoPasseggero getStatoPasseggero() {
        return statoPasseggero;
    }
    public void setStatoPasseggero(StatoPasseggero statoPasseggero) {
        this.statoPasseggero = statoPasseggero;
    }
    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }
    public Boolean getHasFiore() {
        return hasFiore;
    }
    public void setHasFiore(Boolean hasFiore) {
        this.hasFiore = hasFiore;
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
