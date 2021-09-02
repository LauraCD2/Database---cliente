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
    List<ClienteModel> clientes = ClienteDAO.obtenerClientes();
    for (ClienteModel cliente : clientes){
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
    public void actualizarCliente(ClienteModel cliente){
        clienteDAO.actualizarCliente(cliente);
    }
    public void agregarCliente(ClienteModel cliente){
        clienteDAO.agregarCliente(cliente);
    }
    public void eliminarClientePorTag(String TAG){
        clienteDAO.eliminarClientePorTag(TAG);
    }
    public void obtenerClientesPorTag(String TAG){
        clienteDAO.obtenerClientesPorTag(TAG);
    }
     public void obtenerClientesPorCorreo(String email){
        clienteDAO.obtenerClientesPorCorreo(email);
    }
}
