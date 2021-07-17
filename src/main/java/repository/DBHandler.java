package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.common

public class DBHandler {
    String connectionUrl = "jdbc:mysql://localhost:3306/TodoApp";
    String user ="root";
    String pass = "Robertson3";

    PropertiesConfiguration databaseProperties = new PropertiesConfiguration();

    private static Connection connection;

    public DBHandler(){
      databaseProperties.load("application.properties");

       String pass = databaseProperties.getString("");
       String pass = databaseProperties.getString("");
       String pass = databaseProperties.getString("");
       String pass = databaseProperties.getString("");
       String pass = databaseProperties.getString("");
        try{
            connection = DriverManager.getConnection(connectionUrl, user,pass);
        }catch (SQLException ex){
            System.out.println("Unable to connect to database");
            ex.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }


}
