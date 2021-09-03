package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainWindow extends JFrame {
    
    public MainWindow() {
        initComponents();
    }

    private void initComponents() {
        setTitle("CRUD RETO 5 - EQUIPO CHARMANDER");
        
        try{
            setUIFont(new javax.swing.plaf.FontUIResource("Tahoma",Font.PLAIN,16));
        }
        catch(Exception e){}
        
       
        ResultsPanel resultsPanel = new ResultsPanel();
        
        setContentPane(resultsPanel);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        add(new ControlsPanel(resultsPanel));
        
        setSize(1300, 720);
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void setUIFont(javax.swing.plaf.FontUIResource f) {   
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while(keys.hasMoreElements()){
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if(value instanceof javax.swing.plaf.FontUIResource) UIManager.put(key, f);
        }
    }
}

