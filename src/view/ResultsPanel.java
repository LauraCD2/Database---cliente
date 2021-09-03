package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;

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
        this.tblResultados.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        this.tblResultados.setPreferredSize(new Dimension(1190, 700));
        
        //Cambiamos el color de fondo del header de la tabla
        this.tblResultados.getTableHeader().setBackground(Color.BLACK);
        //Cambiamos el color de la letra del header a blanco
        this.tblResultados.getTableHeader().setForeground(Color.WHITE);
        
        this.tblResultados.setBackground(new Color(250,250,250));
        
        //We set the height of the rows
        this.tblResultados.setRowHeight(25);
                
        this.jspPane = new JScrollPane(this.tblResultados);
        this.jspPane.setPreferredSize(new Dimension(1207, 550));
        this.jspPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        this.jspPane.setBorder(BorderFactory.createLineBorder(Color.black));
        add(jspPane, BorderLayout.CENTER);
        
        setPreferredSize(new Dimension(1300, 800));
    }

    public JTable getTblResultados() {
        return tblResultados;
    }

    public void setTblResultados(JTable tblResultados) {
        this.tblResultados = tblResultados;
    }
}
