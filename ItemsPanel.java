package perepainventory;
import javax.swing.*;
/**
 * @author Pranav Perepa
 */

public class ItemsPanel extends JPanel
{
    public JButton IdisplayAll;
    public JButton Iadd;
    public JButton Iremove;
    public JTextField Isearch;
    public JLabel Ilabel;
    
    public ItemsPanel()
    {
        IdisplayAll = new JButton("Display Item Inventory");
        Iadd = new JButton("Add Item");
        Iremove = new JButton("Remove Item");
        Isearch = new JTextField(15);
        Ilabel = new JLabel("Search Items:");
        
        add(IdisplayAll);
        add(Iadd);
        add(Iremove);
        add(Ilabel);
        add(Isearch);
    }
    
}
