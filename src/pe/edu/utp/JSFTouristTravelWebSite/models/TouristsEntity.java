package pe.edu.utp.JSFTouristTravelWebSite.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrupoUTP on 30/07/2016.
 */
public class TouristsEntity {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getIntoTourist(String lastname,String firstname,int DNI,String country,int passages,int cardnumber){
        String sql = "INSERT INTO tourist VALUES ('d','das',123456789,'Mexico',23,32)";
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
