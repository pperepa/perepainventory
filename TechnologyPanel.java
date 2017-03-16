package perepainventory;
import javax.swing.*;
/**
 * @author Pranav Perepa
 */

public class TechnologyPanel extends JPanel
{
    public JButton TdisplayAll;
    public JButton Tadd;
    public JButton Tremove;
    public JTextField Tsearch;
    public JLabel Tlabel;
    
    public TechnologyPanel()
    {
        TdisplayAll = new JButton("Search Technology Inventory");
        Tadd = new JButton("Add Technology");
        Tremove = new JButton("Remove Technology");
        Tsearch = new JTextField(15);
        Tlabel = new JLabel("Search Technology:");
        
        add(TdisplayAll);
        add(Tadd);
        add(Tremove);
        add(Tlabel);
        add(Tsearch);
                
    }
    
}
