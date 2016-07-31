package pe.edu.utp.JSFTouristTravelWebSite.models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by GrupoUTP on 09/07/2016.
 */

@ManagedBean(name = "hrservicefacade",eager = true)
@SessionScoped
public class HRServiceFacade {
    private Connection connection;
    public Connection getConnection() { return connection;}
    public HRServiceFacade(){
        try {
            InitialContext ctx = new InitialContext();
            DataSource ds = (DataSource) ctx.lookup("jdbc/MySQLDataSource");
            connection = ds.getConnection();
        } catch (NamingException | SQLException e) {
            e.printStackTrace();
        }
    }

    private CountriesEntity getCountriesEntity(){
        CountriesEntity countriesEntity = new CountriesEntity();
        countriesEntity.setConnection(connection);
        return countriesEntity;
    }

    private TouristsEntity getTouristsEntity(){
        TouristsEntity touristsEntity = new TouristsEntity();
        touristsEntity.setConnection(connection);
        return touristsEntity;
    }

    public List<Country> getCountries(){return getCountriesEntity().getCountries();}


    public String getTourist(){
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String firstName = ec.getRequestParameterMap().get("firstn");
        String lastName = ec.getRequestParameterMap().get("lastn");
        int DNI = Integer.parseInt(ec.getRequestParameterMap().get("DNI"));
        String country = ec.getRequestParameterMap().get("country");
        int passages = Integer.parseInt(ec.getRequestParameterMap().get("passages"));
        int cardn = Integer.parseInt(ec.getRequestParameterMap().get("cardnumber"));
        return getTouristsEntity().getIntoTourist(firstName,lastName,DNI,country,passages,cardn);}

}

