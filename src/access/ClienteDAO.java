package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteModel;
import utils.ConnectionDB;

public class ClienteDAO {

    private Connection coneccion = null;

    public ArrayList<ClienteModel> obtenerClientes() {
        if (coneccion == null) 
            coneccion = ConnectionDB.getConnection();

        return null;
    }

    public ClienteModel obtenerClientePorTag(String tag) {
        return null;
    }

    public ClienteModel obtenerClientePorCorreo(String correo) {
        return null;
    }

    public void agregarCliente(ClienteModel cliente) {
        try {
            if (coneccion == null) 
                coneccion = ConnectionDB.getConnection();
            

            String sql = "INSERT INTO cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) "
                    + "VALUES (?, ?, ?, ?, ?, ?);";

            PreparedStatement statement = coneccion.prepareStatement(sql);
            statement.setString(1, cliente.getTag());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getEmail());
            statement.setLong(4, cliente.getCelular());
            statement.setString(5, cliente.getClave());
            statement.setDate(6, cliente.getFecha_nto());
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) 
                System.out.println("Se insertaron datos en " + rowsInserted + " columnas.");
            else 
                System.out.println("No funcionó.");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void actualizarLibro(ClienteModel cliente) {
    }

    public void eliminarLibroPorTag(String tag) {
    }

    public void eliminarLibroPorCorreo(String correo) {
    }
}
