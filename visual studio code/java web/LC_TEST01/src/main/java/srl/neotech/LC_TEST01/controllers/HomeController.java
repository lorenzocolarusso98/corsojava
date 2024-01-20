package srl.neotech.LC_TEST01.controllers;
import java.util.Optional;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HomeController {
@GetMapping("/")
public String ritornoTesto(@RequestParam ("numeri")Integer num,@RequestParam ("stringa") String stringa,Model model){
model.addAttribute("stringa"stringa);
model.addAttribute("numeri" num);
retur "Test01"
}
}
