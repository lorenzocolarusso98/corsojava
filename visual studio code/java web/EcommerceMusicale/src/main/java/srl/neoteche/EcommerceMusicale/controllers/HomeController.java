package srl.neoteche.EcommerceMusicale.controllers;

import java.util.Optional;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import srl.neoteche.EcommerceMusicale.Canzone;
import srl.neoteche.EcommerceMusicale.Model.AcquistoRequest;
@Controller
public class HomeController {
    
    @GetMapping("/")
    public String ritornoCanzoni(@RequestParam ("idCanzone")Optional<Integer> idCanzone, Model model){
    Integer risBinding;
    Random random=new Random();
    risBinding=random.nextInt(20);
    Canzone canzone1=new Canzone();
    Canzone canzone2=new Canzone();
    if (risBinding<10) {
        canzone1.setNome("Rolling in the Deep");
        canzone1.setAutore("Adele");
        canzone1.setImmagine("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Adele_-_Live_2016%2C_Glasgow_SSE_Hydro_03.jpg/220px-Adele_-_Live_2016%2C_Glasgow_SSE_Hydro_03.jpg");
        canzone2.setNome("Bones");
        canzone2.setAutore("Imagine dragons");
        canzone2.setImmagine(null);
    }
    if (risBinding>9) {
        canzone1.setNome("Bones");
        canzone1.setAutore("Imagine Dragon");
        canzone1.setImmagine("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Adele_-_Live_2016%2C_Glasgow_SSE_Hydro_03.jpg/220px-Adele_-_Live_2016%2C_Glasgow_SSE_Hydro_03.jpg");
        canzone2.setNome("Rolling in the Deep");
        canzone2.setAutore("Adele");
        canzone2.setImmagine("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Adele_-_Live_2016%2C_Glasgow_SSE_Hydro_03.jpg/220px-Adele_-_Live_2016%2C_Glasgow_SSE_Hydro_03.jpg");
    }
    model.addAttribute("primoPosto", canzone1);
    model.addAttribute("secondoPosto", canzone2);
    return "listaCanzoni";
    
    }

    @GetMapping("/acquista")
    public String acquista(){
        return "acquistaPage";
    }

    @GetMapping("/acquistaForm")
    public String acuistaForm(@ModelAttribute AcquistoRequest parametri){
        System.out.println(parametri.getFname()+ parametri.getLname());
        System.out.println(parametri.getDettaglio().getDescrizione());
        return "acquistoSucces";
    }
    

}
