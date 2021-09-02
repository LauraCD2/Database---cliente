/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.ClienteModel;
import access.ClienteDAO;
import view.ControlsPanel;

/**
 *
 * @author LAURA CAMILA
 */
public class controladorCliente {

    private ClienteDAO clienteDAO;

    public controladorCliente(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public DefaultTableModel consultarClientes() {
        String[] titulos = {"TAG", "NOMBRE", "EMAIL", "TELÉFONO", "NACIMIENTO", "CLAVE"};
        DefaultTableModel tabla = new DefaultTableModel(null, titulos);
    List<Cliente> clientes = ClienteDAO.obtenerClientes();
    for (Cliente cliente : clientes){
            String[] registro = new String[6];
        registro[0] = cliente.getTag();
        registro[1] = cliente.getNombre();
        registro[2] = cliente.getEmail();
        registro[3] = cliente.getFecha_nto();
        registro[4] = cliente.getClave();
        registro[5] = "";
        tabla.addRow(registro);
    }
    return tabla ;
}
    public void actualizarCliente(Cliente cliente){
        clienteDAO.actualizarCliente(cliente);
    }
    public void agregarCliente(Cliente cliente){
        clienteDAO.agregarCliente(cliente);
    }
    public void eliminarCliente(String TAG){
        clienteDAO.eliminarCliente(TAG);
    }
}
