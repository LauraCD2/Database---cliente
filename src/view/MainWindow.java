package view;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainWindow extends JFrame {
    
    public MainWindow() {
        initComponents();
    }

    private void initComponents() {
        setTitle("CRUD RETO 5 - EQUIPO CHARMANDER");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        ResultsPanel resultsPanel = new ResultsPanel();
        setContentPane(resultsPanel);
        add(new ControlsPanel(resultsPanel));
        
        setSize(1040, 720);
        
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
