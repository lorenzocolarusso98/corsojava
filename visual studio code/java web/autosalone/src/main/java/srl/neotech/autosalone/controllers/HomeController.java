package srl.neotech.autosalone.controllers;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import srl.neotech.autosalone.Macchina;
import srl.neotech.autosalone.services.AutosaloneService;

@Controller
public class HomeController {
   

   @Autowired
   AutosaloneService autosaloneService;

   
    @GetMapping("/")
public String ritornoAutosalone(Model model){
   String immagine="ciao";
   Random random=new Random();
   Integer imHome=random.nextInt(2);
   if (imHome<1) {
      immagine="Immagini/iris.webp";
   }
   else{
      immagine="Immagini/audi.jpg";
   }
   autosaloneService.caricaListaAuto();
   model.addAttribute("immagineHome", immagine);
return "index";
}

    @GetMapping("/cayman")
 public String ritorno3(){
    return "cayman";
 }
}
