package access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ClienteModel;
import utils.ConnectionDB;

public class ClienteDAO implements IClienteDAO {

    private Connection coneccion = null;

    @Override
    public ArrayList<ClienteModel> obtenerClientes() {
        ArrayList<ClienteModel> clientes = new ArrayList<>();

        try {
            if (coneccion == null) {
                coneccion = ConnectionDB.getConnection();
            }

            String sql = "SELECT cli_tag AS \"TAG\", cli_nombre AS \"NOMBRE\", cli_email AS \"EMAIL\", cli_celular AS \"TELEFONO\", cli_clave AS \"CLAVE\", cli_fecha_nto AS \"NACIMIENTO\" FROM cliente;";
            Statement statement = coneccion.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                ClienteModel cliente = new ClienteModel(result.getString(1), result.getString(2), result.getString(3), result.getLong(4), result.getString(5), result.getDate(6));
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código: " + ex.getErrorCode() + "\nError: " + ex.getMessage());
        }

        return clientes;
    }

    @Override
    public ArrayList<ClienteModel> obtenerClientesPorTag(String tag) {
        ArrayList<ClienteModel> clientes = new ArrayList<>();

        try {
            if (coneccion == null) {
                coneccion = ConnectionDB.getConnection();
            }

            String sql = "SELECT cli_tag AS \"TAG\", cli_nombre AS \"NOMBRE\", cli_email AS \"EMAIL\", cli_celular AS \"TELEFONO\", cli_clave AS \"CLAVE\", cli_fecha_nto AS \"NACIMIENTO\" FROM cliente WHERE cli_tag LIKE ?;";
            PreparedStatement statement = coneccion.prepareStatement(sql);
            statement.setString(1, "%" + tag + "%");

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                ClienteModel cliente = new ClienteModel(result.getString(1), result.getString(2), result.getString(3), result.getLong(4), result.getString(5), result.getDate(6));
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código: " + ex.getErrorCode() + "\nError: " + ex.getMessage());
        }

        return clientes;
    }

    @Override
    public ArrayList<ClienteModel> obtenerClientesPorCorreo(String correo) {
        ArrayList<ClienteModel> clientes = new ArrayList<>();

        try {
            if (coneccion == null) {
                coneccion = ConnectionDB.getConnection();
            }

            String sql = "SELECT cli_tag AS \"TAG\", cli_nombre AS \"NOMBRE\", cli_email AS \"EMAIL\", cli_celular AS \"TELEFONO\", cli_clave AS \"CLAVE\", cli_fecha_nto AS \"NACIMIENTO\" FROM cliente WHERE cli_email LIKE ?;";
            PreparedStatement statement = coneccion.prepareStatement(sql);
            statement.setString(1, "%" + correo + "%");

            ResultSet result = statement.executeQuery();

            while (result.next()) {
                ClienteModel cliente = new ClienteModel(result.getString(1), result.getString(2), result.getString(3), result.getLong(4), result.getString(5), result.getDate(6));
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código: " + ex.getErrorCode() + "\nError: " + ex.getMessage());
            ex.printStackTrace();
        }

        return clientes;
    }

    @Override
    public void agregarCliente(ClienteModel cliente) {
        try {
            if (coneccion == null) {
                coneccion = ConnectionDB.getConnection();
            }

            String sql = "INSERT INTO cliente(cli_tag, cli_nombre, cli_email, cli_celular, cli_clave, cli_fecha_nto) "
                    + "VALUES (?, ?, ?, ?, ?, ?);";

            PreparedStatement statement = coneccion.prepareStatement(sql);
            statement.setString(1, cliente.getTag());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getEmail());
            statement.setLong(4, cliente.getCelular());
            statement.setString(5, cliente.getClave());
            statement.setDate(6, cliente.getFechaNto());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "¡El registro fue agregado exitosamente!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void actualizarCliente(ClienteModel cliente) {
        try {
            if (coneccion == null) {
                coneccion = ConnectionDB.getConnection();
            }

            String sql = "UPDATE cliente SET cli_tag = ?, cli_nombre = ?, cli_email = ?, cli_celular = ?, cli_clave = ?, "
                    + "cli_fecha_nto = ? WHERE cli_tag LIKE ?;";
            PreparedStatement statement = coneccion.prepareStatement(sql);

            statement.setString(1, cliente.getTag());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getEmail());
            statement.setLong(4, cliente.getCelular());
            statement.setString(5, cliente.getClave());
            statement.setDate(6, cliente.getFechaNto());

            statement.setString(7, cliente.getTag());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "¡El registro fue actualizado exitosamente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código: " + ex.getErrorCode()
                    + "\nError:" + ex.getMessage());
        }
    }

    @Override
    public void eliminarClientePorTag(String tag) {
        try {
            if (coneccion == null) {
                coneccion = ConnectionDB.getConnection();
            }

            String sql = "DELETE FROM cliente WHERE cli_tag LIKE ?;";
            PreparedStatement statement = coneccion.prepareStatement(sql);
            statement.setString(1, tag);
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "¡El registro fue borrado exitosamente!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código: "
                    + ex.getErrorCode() + "\nError:" + ex.getMessage());
        }
    }
}
