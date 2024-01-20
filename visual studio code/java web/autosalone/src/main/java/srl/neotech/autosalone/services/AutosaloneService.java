package srl.neotech.autosalone.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

import srl.neotech.autosalone.Macchina;
import srl.neotech.autosalone.dao.AutosaloneDAO;

@Service
public class AutosaloneService {

@Autowired
AutosaloneDAO autosaloneDAO;

public void caricaListaAuto(){
Faker faker=new Faker();
for (int a=0;a<100;a++){
Macchina m=new Macchina();
m.setId(String.valueOf(a));
m.setMarca(faker.beer().name());
m.setModello(faker.book().title());
m.setTarga(faker.color().name());
autosaloneDAO.getListaMacchine().add(m);
}    
}
public void cancellaAuto(String id){
for(int i=0;i<autosaloneDAO.getListaMacchine().size();i++){
if(autosaloneDAO.getListaMacchine().get(i).getId().equals(id))    
autosaloneDAO.getListaMacchine().remove(i);
}    
}





public AutosaloneDAO getAutosaloneDAO() {
    return autosaloneDAO;
}




public void setAutosaloneDAO(AutosaloneDAO autosaloneDAO) {
    this.autosaloneDAO = autosaloneDAO;
}
}
