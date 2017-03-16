package perepainventory;
import javax.swing.*;
/**
 * @author Pranav Perepa
 */

public class HomePanel extends JPanel
{
    public JTextArea welcomeDisplay;
    
    public HomePanel()
    {
        welcomeDisplay = new JTextArea("Welcome to the Perepa Inventory!");
        welcomeDisplay.setEditable(false);
        add(welcomeDisplay);
    }
    
}
