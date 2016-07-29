package pe.edu.utp.JSFTouristTravelWebSite.models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
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

    private EmployeesEntity getEmployeesEntity(){
        EmployeesEntity employeesEntity = new EmployeesEntity();
        employeesEntity.setConnection(connection);
        return employeesEntity;
    }

    private CountriesEntity getCountriesEntity(){
        CountriesEntity countriesEntity = new CountriesEntity();
        countriesEntity.setConnection(connection);
        return countriesEntity;
    }

    public int getEmployeesCount() { return  getEmployeesEntity().getEmployees().size(); }

    public List<Employee> getEmployees(){return getEmployeesEntity().getEmployees();}

    public List<Country> getCountries(){return getCountriesEntity().getCountries();}
    public List<Country> getCountriesName(){return  getCountriesEntity().getCountriesName();}

    public String getedit(){
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        String firstName = ec.getRequestParameterMap().get("form:firstn");
        String lastName = ec.getRequestParameterMap().get("form:lastn");
        int ide = Integer.parseInt(ec.getRequestParameterMap().get("form:id"));
        return getEmployeesEntity().geteditEmployee(firstName,lastName,ide);}
}


