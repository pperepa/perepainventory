package perepainventory;
import javax.swing.*;
/**
 * @author Pranav
 */
public class AddMoviePanel extends JPanel
{
    public JTextField name;
    public JTextField nationality;
    public JTextField type;
    public JTextField release;
    public JButton enter;
    public JButton cancel;
    public Movie temp;
    JLabel input1 = new JLabel("Enter Movie Title:");
    JLabel input2 = new JLabel("Enter Movie's Nationality:");
    JLabel input3 = new JLabel("Enter Movie's Genre:");
    JLabel input4 = new JLabel("Enter Movie's Release Year:");
    
    
    public AddMoviePanel()
    {
        name = new JTextField(10);
        nationality = new JTextField(10);
        type = new JTextField(10);
        release = new JTextField(10);
        enter = new JButton("Enter");
        cancel = new JButton("Cancel");
     
        add(input1);
        add(name);
        String title1 = name.getText();
        add(input2);
        add(nationality);
        String origin1= nationality.getText();
        add(input3);
        add(type);
        String type1 = type.getText();
        add(input4);
        add(release);
        String release1 = "" + release.getText() + "";
        add(enter);
        add(cancel);
        temp = new Movie(title1, origin1, type1, release1);
    }
    
    public Movie getAddedMovie()
    {
        return temp;
    }

}
