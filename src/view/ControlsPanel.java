/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllers.ClickEvent;
import controllers.InitialData;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.ClienteModel;

/**
 *
 * @author anfeo
 */
public class ControlsPanel extends JPanel {
    private JButton btnBuscar;
    private JButton btnActualizar;
    private JButton btnEliminar;
    private JButton btnAgregar;
    private JButton btnActualizarDatos;
    private JComboBox<String> cbxBuscarPor;
    private JTable tblResultados;
    private JTextField txtCuadroBusqueda;
    
    /**
     * Constructor of the ControlsPanel class.
     * @param tblResultados 
     */
    public ControlsPanel(ResultsPanel resultsPanel) {
        this.tblResultados = resultsPanel.getTblResultados();
        initComponents();
    }
    
    private void initComponents(){
        setLayout(new GridLayout(3,1));
        InitialData initialData = new InitialData();
        
        // Complete clientes info
        this.setTblResultados(initialData.getClientes());
        
        this.txtCuadroBusqueda = new JTextField();
        add(this.getTxtCuadroBusqueda());
        
        // Search button
        this.btnBuscar = new JButton("Buscar");
        add(this.btnBuscar);
        ClickEvent clickEvent = new ClickEvent(this);
        this.getBtnBuscar().addActionListener(clickEvent);
        
        // Insert  button
        this.btnAgregar = new JButton("Agregar Cliente");
        add(this.getBtnAgregar());
        this.getBtnAgregar().addActionListener(clickEvent);
        
        //Update button
         this.btnActualizar = new JButton("Actualizar Tabla");
        add(this.getBtnActualizar());
        this.getBtnActualizar().addActionListener(clickEvent);
        
        //Update data button
         this.btnEliminar = new JButton("Borrar cliente");
        add(this.getBtnEliminar());
        this.getBtnEliminar().addActionListener(clickEvent);
        
        //Delete button
         this.btnActualizarDatos = new JButton("Actualizar datos del cliente");
        add(this.getBtnActualizarDatos());
        this.getBtnActualizarDatos().addActionListener(clickEvent);
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public JComboBox<String> getCbxBuscarPor() {
        return cbxBuscarPor;
    }

    public JTextField getTxtCuadroBusqueda() {
        return txtCuadroBusqueda;
    }

    public JTable getTblResultados() {
        return tblResultados;
    }

    public JButton getBtnActualizarDatos() {
        return btnActualizarDatos;
    }

    public void setTblResultados(ArrayList<ClienteModel> clientes) {
        String[] headers = {"TAG", "NOMBRE", "EMAIL", "TELÉFONO", "NACIMIENTO", "CLAVE"};
        this.tblResultados.removeAll();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(headers); 
        this.tblResultados.setModel(tableModel);
        for(int i = 0; i < clientes.size(); i++){
            tableModel.addRow( clientes.get(i).toArray() );
        }
        
        Object[] filaVacia = {null, null, null, null, null, null};
        tableModel.addRow(filaVacia);
    }
}
