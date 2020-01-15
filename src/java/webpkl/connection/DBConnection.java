/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webpkl.connection;

//import com.mchange.v2.c3p0.*;
import webpkl.controller.*;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diptaisme
 */
public class DBConnection {

    private Connection conn = null;
    private static DBConnection instance = null;
    //ComboPooledDataSource cpds = new ComboPooledDataSource();
    
    
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    private DBConnection() {
        
        try {
            Class.forName(DBProperties.DB_DRIVER);            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Pesan Kesalahan : " + e.getMessage());
        }
    }

    public void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public Connection getConnection(){
        try {
            conn = DriverManager.getConnection(DBProperties.DB_URL, DBProperties.DB_USERNAME, DBProperties.DB_PASSWORD);
            return conn;
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
  
//        public ComboPooledDataSource getConnection(){
//       // cpds.setDriverClass( "org.postgresql.Driver" ); //loads the jdbc driver            
//        cpds.setJdbcUrl( DBProperties.DB_URL );
//        cpds.setUser( DBProperties.DB_USERNAME );                                  
//        cpds.setPassword( DBProperties.DB_PASSWORD );
//        cpds.setMaxStatements( 180 ); 
//        
//        return cpds;
//    }
}
