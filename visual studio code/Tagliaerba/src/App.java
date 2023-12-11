import srl.neotech.tagliaerba.Tagliaerba;

public class App {
    public static void main(String[] args) throws Exception {
    Tagliaerba robot=new Tagliaerba();
    Integer numeroSteps=1;
    for (Integer i=0;i<10;i++){
    if (robot.getDirezioneAttuale().equals("destra")){
    robot.avanza();
    robot.giraSx();
    robot.setDirezioneAttuale("sinistra");
    System.out.println("nuova direzione:sinistra"); 
    robot.setAltezzaLame(4);
    System.out.println("altezza lame impostata a 4");
    System.out.println("numero steps"+numeroSteps);
    numeroSteps=numeroSteps+1;   
    }
    else{
    robot.avanza();
    robot.giradx();
    robot.setDirezioneAttuale("destra");
    System.out.println("nuova direzione:destra"); 
    robot.setAltezzaLame(2);
    System.out.println("altezza lame impostata a 2");
    System.out.println("numero steps"+numeroSteps);
    numeroSteps=numeroSteps+1;
    }
    System.out.println("-----------------------------------");
    }
    }
}
