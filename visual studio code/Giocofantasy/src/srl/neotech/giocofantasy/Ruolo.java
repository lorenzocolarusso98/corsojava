package srl.neotech.giocofantasy;

public class Ruolo {
    public String nomeclasse;
    private Double stamina;
    private Double forzaAttacco;
    private Double forzaDifesa;
    public void attacca(Ruolo nemico){
    }
    protected void difendi(Double attacco){    
    }
    public Double getStamina() {
        return stamina;
    }
    public void setStamina(Double stamina) {
        this.stamina = stamina;
    }
    public Double getForzaAttacco() {
        return forzaAttacco;
    }
    public void setForzaAttacco(Double forzaAttacco) {
        this.forzaAttacco = forzaAttacco;
    }
    public Double getForzaDifesa() {
        return forzaDifesa;
    }
    public void setForzaDifesa(Double forzaDifesa) {
        this.forzaDifesa = forzaDifesa;
    }
    @Override
    public String toString() {
        return "Ruolo [nomeclasse=" + nomeclasse + ", stamina=" + stamina + ", forzaAttacco=" + forzaAttacco
                + ", forzaDifesa=" + forzaDifesa + "]";
    }
}
