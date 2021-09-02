package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.json.simple.*;
import org.json.simple.parser.*;


public class ConnectionDB {
    
    public static Connection getConnection() {
        JSONParser parser = new JSONParser();
        Connection conn = null;
        // conectar
        try {
            String credentials_path = System.getProperty("user.dir") + "/src/utils/db_credentials.json";
            JSONObject jsonObject = (JSONObject)parser.parse(new FileReader(credentials_path));
            
            String tag        = (String)jsonObject.get("tag");
            String nombre     = (String)jsonObject.get("nombre");
            String email      = (String)jsonObject.get("email");
            long celular      = (long)jsonObject.get("celular");
            String clave      = (String)jsonObject.get("clave");
            Date fecha_nto    = (Date)jsonObject.get("fecha_nto);
            String schemaName = "basedatosreto4";
            String dbURL      = "jdbc:mysql://"+host+":"+port+"/"+schemaName;
            
            conn = DriverManager.getConnection(dbURL, username, password);
            //if( conn != null ) 
            //   System.out.println ( "Conectado" );
        } 
        catch( SQLException | FileNotFoundException ex ) {
            ex.printStackTrace();
        } 
        catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
        
        return conn;
    }
    
    public static void main(String[] args){
        getConnection();
    }
}
