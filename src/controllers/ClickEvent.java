package controllers;

import access.ClienteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ClienteModel;
import view.ControlsPanel;

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
            ArrayList<ClienteModel> clientes = clienteDAO.obtenerClientesPorTag(tagCliente);
            this.controlsPanel.setTblResultados(clientes);

        } else if (actionEvent.getSource() == this.controlsPanel.getBtnActualizarDatos()) {
            int fila = this.controlsPanel.getTblResultados().getSelectedRow();
            int columnas = this.controlsPanel.getTblResultados().getColumnCount();

            Object[] datos = new Object[6];

            for (int i = 0; i < columnas; i++) {
                datos[i] = this.controlsPanel.getTblResultados().getValueAt(fila, i);
            }
            try {
                ClienteModel cliente = new ClienteModel((String) datos[0], (String) datos[1], (String) datos[2], (long) datos[3], (String) datos[5], (Date) datos[4]);
                clienteDAO.actualizarCliente(cliente);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "¡Por favor, verifique los datos ingresados!");
            }
        } else if (actionEvent.getSource() == this.controlsPanel.getBtnEliminar()) {
            int fila = this.controlsPanel.getTblResultados().getSelectedRow();
            String TagClienteEliminar = (String) this.controlsPanel.getTblResultados().getValueAt(fila, 0);
            JOptionPane.showMessageDialog(null, TagClienteEliminar);
            clienteDAO.eliminarClientePorTag(TagClienteEliminar);
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
                    ClienteModel cliente = new ClienteModel((String) datos[0], (String) datos[1], (String) datos[2], (long) datos[3], (String) datos[5], (Date) datos[4]);
                    clienteDAO.agregarCliente(cliente);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "¡Por favor, verifique los datos ingresados!");
                    ex.printStackTrace();
                }

            } else {
                JOptionPane.showMessageDialog(null, "¡Por favor ingrese todos los campos!");
            }
        }
    }
}
