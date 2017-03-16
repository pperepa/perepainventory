package perepainventory;
import javax.swing.*;
/**
 * @author Pranav Perepa
 */

public class AudioTapesPanel extends JPanel
{
    public JButton ATdisplayAll;
    public JButton ATadd;
    public JButton ATremove;
    public JTextField ATsearch;
    public JLabel ATlabel;
    
    public AudioTapesPanel()
    {
        ATdisplayAll = new JButton("Display Audio Tape Inventory");
        ATadd = new JButton("Add Audio Tape");
        ATremove = new JButton("Remove Audio Tape");
        ATsearch = new JTextField(15);
        ATlabel = new JLabel("Search Audio Tapes:");
        
        add(ATdisplayAll);
        add(ATadd);
        add(ATremove);
        add(ATlabel);
        add(ATsearch);
                
    }
    
}
