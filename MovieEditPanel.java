package perepainventory;
import java.awt.*;
import javax.swing.*;
/**
 * @author Pranav Perepa
 */

public class MovieEditPanel extends JPanel
{
    public JTextField name;
    public JTextField nationality;
    public JTextField type;
    public JTextField release;
    
    public MovieEditPanel()
    {
        JLabel input1 = new JLabel("Edit Movie Title:");
        JLabel input2 = new JLabel("Edit Movie's Nationality:");
        JLabel input3 = new JLabel("Edit Movie's Genre:");
        JLabel input4 = new JLabel("Edit Movie's Release Year:");
        name = new JTextField(10);
        nationality = new JTextField(10);
        type = new JTextField(10);
        release = new JTextField(10);
        setLayout(new FlowLayout());
        add(input1);
        add(name);
        System.out.println("");
        add(input2);
        add(nationality);
        System.out.println("");
        add(input3);
        add(type);
        System.out.println("");
        add(input4);
        add(release);
    }
}
