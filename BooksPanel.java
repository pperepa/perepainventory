package perepainventory;
import javax.swing.*;
/**
 * @author Pranav Perepa
 */

public class BooksPanel extends JPanel
{
    public JButton BdisplayAll;
    public JButton Badd;
    public JButton Bremove;
    public JTextField Bsearch;
    public JLabel Blabel;
    
    public BooksPanel()
    {
        BdisplayAll = new JButton("Display Book Inventory");
        Badd = new JButton("Add Book");
        Bremove = new JButton("Remove Book");
        Bsearch = new JTextField(15);
        Blabel = new JLabel("Search Books:");
        
        add(BdisplayAll);
        add(Badd);
        add(Bremove);
        add(Blabel);
        add(Bsearch);
    }
    
}
