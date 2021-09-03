package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;

/**
 *
 * @author anfeo
 */
public class ResultsPanel extends JPanel {
    private JTable tblResultados;
    private JScrollPane jspPane;

    public ResultsPanel() {
        initComponents();
    }
    
    private void initComponents(){
        this.tblResultados = new JTable();
        this.tblResultados.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        this.jspPane = new JScrollPane(this.tblResultados);
        add(jspPane, BorderLayout.CENTER);
        
        setPreferredSize(new Dimension(1020, 800));
    }

    public JTable getTblResultados() {
        return tblResultados;
    }

    public void setTblResultados(JTable tblResultados) {
        this.tblResultados = tblResultados;
    }
}
