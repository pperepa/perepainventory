package perepainventory;
import javax.swing.*;
/**
 * @author Pranav Perepa
 */

public class SoftwarePanel extends JPanel
{
    public JButton SdisplayAll;
    public JButton Sadd;
    public JButton Sremove;
    public JTextField Ssearch;
    public JLabel Slabel;
    
    public SoftwarePanel()
    {
        SdisplayAll = new JButton("Display Software Inventory");
        Sadd = new JButton("Add Software");
        Sremove = new JButton("Remove Software");
        Ssearch = new JTextField(15);
        Slabel = new JLabel("Search Softwares:");
        
        add(SdisplayAll);
        add(Sadd);
        add(Sremove);
        add(Slabel);
        add(Ssearch);
             
    }
    
}
