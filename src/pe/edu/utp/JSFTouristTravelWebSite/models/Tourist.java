package pe.edu.utp.JSFTouristTravelWebSite.models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by GrupoUTP on 30/07/2016.
 */
@ManagedBean(name = "tourist")
@SessionScoped
public class Tourist {
    private String lastname;
    private String firstname;
    private int DNI;
    private String country;
    private int passages;
    private int cardnumber;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPassages() {
        return passages;
    }

    public void setPassages(int passages) {
        this.passages = passages;
    }

    public int getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(int cardnumber) {
        this.cardnumber = cardnumber;
    }
}
