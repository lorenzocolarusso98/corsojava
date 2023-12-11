package srl.neotech.tagliaerba;

public class Tagliaerba {
    Integer altezzaLame=2;
    String direzioneAttuale="destra";
    public void avanza(){
        System.out.println("il robot avanza di 100 metri");
    }
    public void giraSx(){
        System.out.println("il robot si gira di 180 gradi a sinistra.");
    }
    public void giradx(){
        System.out.println("il robot si gira di 180 gradi a destra");
    }
    public Integer getAltezzaLame() {
        return altezzaLame;
    }
    public void setAltezzaLame(Integer altezzaLame) {
        this.altezzaLame = altezzaLame;
    }
    public String getDirezioneAttuale() {
        return direzioneAttuale;
    }
    public void setDirezioneAttuale(String direzioneAttuale) {
        this.direzioneAttuale = direzioneAttuale;
    }
}