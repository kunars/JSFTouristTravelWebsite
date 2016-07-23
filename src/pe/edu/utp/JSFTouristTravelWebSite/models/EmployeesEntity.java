package pe.edu.utp.JSFTouristTravelWebSite.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrupoUTP on 09/07/2016.
 */
public class EmployeesEntity {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public List<Employee> getEmployees(){
        String sql = "SELECT * FROM Employees";
        List<Employee> employees = new ArrayList<>();
        if(connection == null) return null;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if(rs == null) return null;
            while (rs.next()){
                Employee employee = new Employee();
                employee.setFirstName(rs.getString("first_name"));
                employee.setLastName(rs.getString("last_name"));
                employee.setEmployeeid(rs.getInt("employee_id"));
                employees.add(employee);
            };
            return employees;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public String geteditEmployee(String firstName,String lastName,int id){
        String sql = "UPDATE employees SET first_name='" + firstName + "',last_name='" + lastName+ "' WHERE employee_id="+ id;
        if(connection == null) return null;
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
