package pack1;

public class Citta {
    private String nome;
    private Integer popolazione;
    private SquadraDiCalcio ASRoma=new SquadraDiCalcio();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getPopolazione() {
        return popolazione;
    }
    public void setPopolazione(Integer popolazione) {
        this.popolazione = popolazione;
    }
    public SquadraDiCalcio getASRoma() {
        return ASRoma;
    }
    public void setASRoma(SquadraDiCalcio aSRoma) {
        ASRoma = aSRoma;
    }
    
}
