package srl.neotech.marsrover;

public class Passo {
String tipo;
Integer numeroStep;
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
public Integer getNumeroStep() {
    return numeroStep;
}
public void setNumeroStep(Integer numeroStep) {
    this.numeroStep = numeroStep;
}
@Override
public String toString() {
    return "Passo [tipo=" + tipo + ", numeroStep=" + numeroStep + "]";
}    
}
