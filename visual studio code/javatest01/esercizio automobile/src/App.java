public class App {
    public static void main(String[] args) throws Exception {
    Automobile auto1=new Automobile();
    auto1.marca="Mercedes";
    auto1.modello="classe e";
    auto1.cilindrata=2000;
    auto1.colore="bianco";

    Automobile auto2=new Automobile();
    auto2.marca="Ford";
    auto2.modello="Focus";
    auto2.cilindrata=1000;
    auto2.colore="blu";

    System.out.println(auto1);
    System.out.println(auto2);
    }
}
