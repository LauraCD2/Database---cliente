/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//controllers
import controller.Change;
import controller.Click;
import controller.InitialData;

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
 * @author LAURA CAMILA
 */
public class ControlsPanel extends JPanel{
    //private JLabel                       lblMuseums;
    //private JComboBox<MuseumModel>       cbxMuseumsList;
    //private JLabel                       lblPresentations;
    //private JComboBox<PresentationModel> cbxPresentationsList;
    //private JLabel                       lblName;
    private JTextField                   txtBuscar;
    private JComboBox</clienteModel/???>                  cbxBuscarPor;
    private JButton                      btnActualizar;
    private JButton                      btnEliminar;
    private JButton                      btnAgregarCliente;
    private JButton                      btnSearch;
    private JTable                       tblResults;
    
     /**
     * Constructor of the ControlsPanel class.
     * @param resultsPanel
     */
    public ControlsPanel(ResultsPanel resultsPanel){
        this.tblResults = resultsPanel.getTblResults();
        initComponents();
    }
    
    private void initComponents(){
        setLayout(new GridLayout(2,1));
        InitialData initialData = new InitialData();
        
    // Complete ? info
        this.setTblResults(initialData.get?());   
        
    }
}
