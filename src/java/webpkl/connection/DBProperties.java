/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webpkl.connection;

//import com.mchange.v2.c3p0.*;

import webpkl.controller.*;
//import com.mchange.v2.c3p0.*;

/**
 *
 * @author diptaisme
 */
public class DBProperties {
    

    public static String DB_URL="jdbc:mysql://localhost/baru";
    public static String DB_USERNAME="root";
    public static String DB_PASSWORD="";
    public static String DB_DRIVER="com.mysql.jdbc.Driver";
    
}


//
//public class DBProperties {
//    public static String DB_URL;
//    public static String DB_USERNAME;
//    public static String DB_PASSWORD;
//    public static String DB_DRIVER;
//    
//}


/*

ComboPooledDataSource cpds = new ComboPooledDataSource();
cpds.setDriverClass( "org.postgresql.Driver" ); //loads the jdbc driver            
cpds.setJdbcUrl( "jdbc:postgresql://localhost/testdb" );
cpds.setUser("dbuser");                                  
cpds.setPassword("dbpassword");
cpds.setMaxStatements( 180 );  
cpds.close();

*/

