package pack1;

public class SquadraDiCalcio {
    private String nome;
    private Integer numeroTifosi;
    private String colore;
    private Stadio stadioOlimpico=new Stadio();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumeroTifosi() {
        return numeroTifosi;
    }
    public void setNumeroTifosi(Integer numeroTifosi) {
        this.numeroTifosi = numeroTifosi;
    }
    public String getColore() {
        return colore;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }
    public Stadio getStadioOlimpico() {
        return stadioOlimpico;
    }
    public void setStadioOlimpico(Stadio stadioOlimpico) {
        this.stadioOlimpico = stadioOlimpico;
    }
    
}
