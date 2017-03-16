package perepainventory;
import javax.swing.*;
/**
 * @author Pranav Perepa
 */

public class CassettesPanel extends JPanel
{
    public JButton CdisplayAll;
    public JButton Cadd;
    public JButton Cremove;
    public JTextField Csearch;
    public JLabel Clabel;
    
    public CassettesPanel()
    {
        CdisplayAll = new JButton("Display Cassette Inventory");
        Cadd = new JButton("Add Cassette");
        Cremove = new JButton("Remove Cassette");
        Csearch = new JTextField(15);
        Clabel = new JLabel("Search Cassettes:");
        
        add(CdisplayAll);
        add(Cadd);
        add(Cremove);
        add(Clabel);
        add(Csearch);
    }
    
}
