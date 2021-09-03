package view;

import controllers.ClickEvent;
import controllers.InitialData;

import model.ClienteModel;

import java.awt.Color;
import java.awt.GridLayout;;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
    private JLabel relleno;
    private JLabel relleno2;
    private JLabel relleno3;
    
    
    /**
     * Constructor of the ControlsPanel class.
     * @param resultsPanel
      
     */
    public ControlsPanel(ResultsPanel resultsPanel) {
        this.tblResultados = resultsPanel.getTblResultados();
        this.setAlignmentX(CENTER_ALIGNMENT);
        this.setAlignmentY(BOTTOM_ALIGNMENT);
        initComponents();
    }
    
    private void initComponents(){
        setBorder(BorderFactory.createLineBorder(Color.black));
        setLayout(new GridLayout(3, 2, 15, 15));
        InitialData initialData = new InitialData();
         
        // Complete clientes info
        this.setTblResultados(initialData.getClientes());
        
        this.txtCuadroBusqueda = new JTextField();
        this.txtCuadroBusqueda.setBorder(BorderFactory.createLineBorder(Color.black));
        add(this.getTxtCuadroBusqueda());
        
        // Search button
        this.btnBuscar = new JButton("Buscar");
        this.btnBuscar.setBackground(Color.CYAN);
        add(this.btnBuscar);
        ClickEvent clickEvent = new ClickEvent(this);
        this.getBtnBuscar().addActionListener(clickEvent);
        
        // Insert  button
        this.btnAgregar = new JButton("Agregar Cliente"); 
        this.btnAgregar.setBackground(Color.GREEN);
        add(this.getBtnAgregar());
        this.getBtnAgregar().addActionListener(clickEvent);
        
        //Update button
         this.btnActualizar = new JButton("Actualizar Tabla");
         this.btnActualizar.setBackground(Color.YELLOW);
        add(this.getBtnActualizar());
        this.getBtnActualizar().addActionListener(clickEvent);
        
        //Update data button
         this.btnEliminar = new JButton("Borrar cliente");
         this.btnEliminar.setBackground(Color.RED);
        add(this.getBtnEliminar());
        this.getBtnEliminar().addActionListener(clickEvent);
        
        //Delete button
         this.btnActualizarDatos = new JButton("Actualizar datos del cliente");
         this.btnActualizarDatos.setBackground(Color.MAGENTA);
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
        
        //We give a huge Width to Email column because the values can be large.
        this.tblResultados.getColumnModel().getColumn(2).setPreferredWidth(160);
        //we give less Width to Birtday because the values are short
        this.tblResultados.getColumnModel().getColumn(3).setPreferredWidth(20);
        //we give less Width to Birtday because the values are short
        this.tblResultados.getColumnModel().getColumn(4).setPreferredWidth(20);
        
        Object[] filaVacia = {null, null, null, null, null, null};
        tableModel.addRow(filaVacia);
    }
}
