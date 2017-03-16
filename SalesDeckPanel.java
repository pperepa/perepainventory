package perepainventory;
import javax.swing.*;
/**
 * @author Pranav Perepa
 */

public class SalesDeckPanel extends JPanel
{
    public JButton SDdisplayAll;
    public JButton SDadd;
    public JButton SDremove;
    public JTextField SDsearch;
    public JLabel SDlabel;
    
    public SalesDeckPanel()
    {
        SDdisplayAll = new JButton("Display Sales Deck");
        SDadd = new JButton("Add Item To Sell");
        SDremove = new JButton("Remove Item from Sales Deck");
        SDsearch = new JTextField(15);
        SDlabel = new JLabel("Search Sales Deck:");
        
        add(SDdisplayAll);
        add(SDadd);
        add(SDremove);
        add(SDlabel);
        add(SDsearch);
        
    }
    
}
