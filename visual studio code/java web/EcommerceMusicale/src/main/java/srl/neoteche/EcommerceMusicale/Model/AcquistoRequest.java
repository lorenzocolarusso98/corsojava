package srl.neoteche.EcommerceMusicale.Model;

public class AcquistoRequest {
private String fname;
private String lname;
private AcquistoDettaglioRequest dettaglio;



public AcquistoDettaglioRequest getDettaglio() {
    return dettaglio;
}
public void setDettaglio(AcquistoDettaglioRequest dettaglio) {
    this.dettaglio = dettaglio;
}
public String getFname() {
    return fname;
}
public void setFname(String fname) {
    this.fname = fname;
}
public String getLname() {
    return lname;
}
public void setLname(String lname) {
    this.lname = lname;
}
}
