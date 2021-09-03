package controllers;

import access.ClienteDAO;
import java.util.ArrayList;
import model.ClienteModel;

/**
 *
 * @author anfeo
 */
public class InitialData {
    private ArrayList<ClienteModel> clientes = null;

    public InitialData() {
        ClienteDAO clienteDAO = new ClienteDAO();
        this.clientes = clienteDAO.obtenerClientes();
    }

    /**
     * @return the clientes
     */
    public ArrayList<ClienteModel> getClientes() {
        return clientes;
    }
}
