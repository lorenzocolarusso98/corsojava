package srl.neoteche.EcommerceMusicale.Model;

public class AcquistoDettaglioRequest {
    private String descrizione;
    private Integer quantita;
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public Integer getQuantita() {
        return quantita;
    }
    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

}
