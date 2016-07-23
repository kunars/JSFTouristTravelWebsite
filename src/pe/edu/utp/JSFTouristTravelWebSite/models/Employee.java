package pe.edu.utp.JSFTouristTravelWebSite.models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by GrupoUTP on 09/07/2016.
 */
@ManagedBean(name = "employee")
@SessionScoped
public class Employee {
    private int employeeid;
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmployeeid() {return employeeid;}

    public void setEmployeeid(int employeeid) {this.employeeid = employeeid;}
}
