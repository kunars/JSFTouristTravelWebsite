package pe.edu.utp.JSFTouristTravelWebSite.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GRLIMA on 23/07/2016.
 */
public class CountriesEntity {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public List<Country> getCountries() {
        String sql = "SELECT * FROM countries";
        List<Country> countries = new ArrayList<>();
        if (connection == null) return null;
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs == null) return null;
            while (rs.next()) {
                Country country = new Country();
                country.setCountryid(rs.getString("country_id"));
                country.setRegionid(rs.getInt("region_id"));
                country.setCountryname(rs.getString("country_name"));
                countries.add(country);
            }
            ;
            return countries;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

        public List<Country> getCountriesName(){
            String sql = "SELECT country_name FROM Countries";
            List<Country> countries = new ArrayList<>();
            if(connection == null) return null;
            try {
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                if(rs == null) return null;
                while (rs.next()){
                    Country country = new Country();
                    country.setCountryname(rs.getString(0));
                    countries.add(country);
                };
                return countries;
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
    }  }
