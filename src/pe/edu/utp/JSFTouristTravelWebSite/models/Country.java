package pe.edu.utp.JSFTouristTravelWebSite.models;

/**
 * Created by GRLIMA on 23/07/2016.
 */
public class Country {
    private String countryid;
    private String countryname;
    private int regionid;


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

    public int getRegionid() {
        return regionid;
    }

    public void setRegionid(int regionid) {
        this.regionid = regionid;
    }
}
