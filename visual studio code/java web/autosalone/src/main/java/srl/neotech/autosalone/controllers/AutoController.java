package srl.neotech.autosalone.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import srl.neotech.autosalone.Macchina;
import srl.neotech.autosalone.services.AutosaloneService;

@Controller
public class AutoController {
    @Autowired
    AutosaloneService autosaloneService;


     @GetMapping("listaauto")
 public String ritorno2(Model model){
 ArrayList<Macchina>listaMacchine=autosaloneService.getAutosaloneDAO().getListaMacchine();
 model.addAttribute("macchine", listaMacchine);

    return "listaveicoli";
 }


 @GetMapping("cancellaAuto")
 public String cancellaAuto(@RequestParam("id")String idDaCancellare, Model model){
    autosaloneService.cancellaAuto(idDaCancellare);
    ArrayList<Macchina>listaMacchine=autosaloneService.getAutosaloneDAO().getListaMacchine();
 model.addAttribute("macchine", listaMacchine);
 return "listaveicoli";
 }
}
