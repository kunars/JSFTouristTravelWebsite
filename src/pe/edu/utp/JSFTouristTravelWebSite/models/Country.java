package pe.edu.utp.JSFTouristTravelWebSite.models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by GRLIMA on 23/07/2016.
 */
@ManagedBean(name = "country")
@SessionScoped
public class Country {
    private String countryid;
    private String countryname;
    private double countrycost;
    private String description;
    private String regionid;


    public String getCountryid() {
        return countryid;
    }

    public void setCountryid(String countryid) {
        this.countryid = countryid;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public double getCountrycost() {
        return countrycost;
    }

    public void setCountrycost(double countrycost) {
        this.countrycost = countrycost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid;
    }
}
