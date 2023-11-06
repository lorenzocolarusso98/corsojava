public class App {
    public static void main(String[] args) throws Exception {
    Libro libro1=new Libro();
    libro1.titolo="Le cronache di Narnia";
    libro1.pagine=1168;
    libro1.genere="Fantasy";

    Libro libro2=new Libro();
    libro2.titolo="lo hobbit un viaggio inaspettato";
    libro2.pagine=432;
    libro2.genere="fantasy";

    Libro libro3=new Libro();
    libro3.titolo="IT";
    libro3.pagine=1320;
    libro3.genere="horror";

    System.out.println(libro1);
    System.out.println(libro2);
    System.out.println(libro3);
    }
}
