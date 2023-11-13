package srl.giocoFantasy;

public class Orco extends Ruolo{
    Double moltdifesa=0.2;

    public Double getMoltdifesa() {
        return moltdifesa;
    }

    public void setMoltdifesa(Double moltdifesa) {
        this.moltdifesa = moltdifesa;
    }
    Double DifesaFinale=forzaDifesa*0.2;

    public Double getDifesaFinale() {
        return DifesaFinale;
    }

    public void setDifesaFinale(Double difesaFinale) {
        DifesaFinale = difesaFinale;
    }
}
