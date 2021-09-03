package controllers;

import access.ClienteDAO;
import model.ClienteModel;
import view.ControlsPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class ClickEvent implements ActionListener {

    ClienteDAO clienteDAO = new ClienteDAO();
    private ControlsPanel controlsPanel;
    private String tagCliente = "";

    public ClickEvent(ControlsPanel controlsPanel) {
        this.controlsPanel = controlsPanel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.controlsPanel.getBtnBuscar()) {
            this.tagCliente = (String) this.controlsPanel.getTxtCuadroBusqueda().getText();

            ArrayList<ClienteModel> clientes = clienteDAO.obtenerClientesPorTag(tagCliente);
            this.controlsPanel.setTblResultados(clientes);

        } else if (actionEvent.getSource() == this.controlsPanel.getBtnActualizar()) {
            actualizarTabla();
            
        } else if (actionEvent.getSource() == this.controlsPanel.getBtnActualizarDatos()) {
            try{
                int fila = this.controlsPanel.getTblResultados().getSelectedRow();
                int columnas = this.controlsPanel.getTblResultados().getColumnCount();

                Object[] datos = new Object[6];

                for (int i = 0; i < columnas; i++) {
                    datos[i] = this.controlsPanel.getTblResultados().getValueAt(fila, i);
                }

                try {
                    //If it's a Empty String we set it null
                    if (datos[3].equals("")) {
                        datos[3] = null;
                    }
                    if (datos[5].equals("")) {
                        datos[5] = null;
                    }
                    
                    ClienteModel cliente = new ClienteModel((String) datos[0], (String) datos[1], (String) datos[2], datos[3], (String) datos[5], (Date) datos[4]);
                    clienteDAO.actualizarCliente(cliente);
                    actualizarTabla();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "¡Por favor, verifique los datos ingresados!");
                }
            } catch (ArrayIndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(null, "¡Por favor seleccione una fila!");
            }
            
        } else if (actionEvent.getSource() == this.controlsPanel.getBtnEliminar()) {
            try {
                int fila = this.controlsPanel.getTblResultados().getSelectedRow();
                String TagClienteEliminar = (String) this.controlsPanel.getTblResultados().getValueAt(fila, 0);
                if (TagClienteEliminar != null) {
                    int result = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea borrar este cliente?", null, JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION) {
                        clienteDAO.eliminarClientePorTag(TagClienteEliminar);
                        actualizarTabla();
                    }
                }
            } catch (ArrayIndexOutOfBoundsException ex){
                JOptionPane.showMessageDialog(null, "¡Por favor seleccione una fila!");
            }
            
        } else if (actionEvent.getSource() == this.controlsPanel.getBtnAgregar()) {
            int ultima = this.controlsPanel.getTblResultados().getRowCount() - 1;

            if (controlsPanel.getTblResultados().getValueAt(ultima, 0) != null && controlsPanel.getTblResultados().getValueAt(ultima, 1) != null
                    && controlsPanel.getTblResultados().getValueAt(ultima, 2) != null && controlsPanel.getTblResultados().getValueAt(ultima, 4) != null) {
                int columnas = this.controlsPanel.getTblResultados().getColumnCount();

                Object[] datos = new Object[6];

                for (int i = 0; i < columnas; i++) {
                    datos[i] = this.controlsPanel.getTblResultados().getValueAt(ultima, i);
                }

                try {
                    ClienteModel cliente = new ClienteModel((String) datos[0], (String) datos[1], (String) datos[2], datos[3], (String) datos[5], Date.valueOf((String) datos[4]));
                    clienteDAO.agregarCliente(cliente);
                    actualizarTabla();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "¡Por favor, verifique los datos ingresados!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "¡Por favor ingrese todos los campos!");
            }
        }
    }
    
    private void actualizarTabla(){
        ArrayList<ClienteModel> clientes = clienteDAO.obtenerClientesPorTag(tagCliente);
        this.controlsPanel.setTblResultados(clientes);
    }
}
