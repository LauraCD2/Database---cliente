/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.UIManager;
import javax.swing.JFrame;


/**
 *
 * @author LAURA CAMILA
 */
public class MainWindow extends JFrame {
    
    public MainWindow(){
        initComponents();
    }
    
    private void initComponents(){
        setTitle("CRUD RETO 5 - CLIENTE");
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        ResultsPanel resultsPanel = new ResultsPanel();
        setContentPane(resultsPanel);
        add(new ControlsPanel(resultsPanel));
        
        setSize(1040, 720);
        
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
