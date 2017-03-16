package perepainventory;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author Pranav Perepa
 */

public class MoviesPanel extends JPanel
{
    public JButton MdisplayAll;
    public JButton Madd;
    public JButton Mremove;
    public JTextField Msearch;
    public JLabel Mlabel;
    public Movie [][] data;
    


    public MoviesPanel()
    {

        MdisplayAll = new JButton("Display Movie Inventory");
        Madd = new JButton("Add Movie");
        Mremove = new JButton("Remove Movie");
        Msearch = new JTextField(15);
        Mlabel = new JLabel("Search Movie:");

        
        MdisplayAll.addActionListener(new DisplayListener());
        Madd.addActionListener(new AddListener());
        
        add(MdisplayAll);
        add(Madd);
        add(Mremove);
        add(Mlabel);
        add(Msearch);
        
        
    }
    

    
    private class DisplayListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            
           Object[][] data = {
           {"Mary", "Campione", 
            "Snowboarding", new Integer(5), false},
           {"Alison", "Huml", 
            "Rowing", new Integer(3), true},
           {"Kathy", "Walrath",
            "Chasing toddlers", new Integer(2), false},
           {"Mark", "Andrews",
           "Speed reading", new Integer(20), true},
          {"Angela", "Lih",
           "Teaching high school", new Integer(4), false}
          };

          String[] columnNames = {"First Name", 
           "Last Name",
           "Sport",
           "# of Years",
           "Vegetarian"};

         JTable table = new JTable(data, columnNames);
         JScrollPane scrollPane = new JScrollPane(table);
         JPanel panel = new JPanel();
         panel.add(scrollPane);
         JFrame frame = new JFrame();
         frame.getContentPane().add(panel, BorderLayout.CENTER);
         frame.setSize(900,200);
         frame.setVisible(true);
         
        }
        
    }
    
    private class AddListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            JFrame add = new JFrame();
            add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            add.getContentPane().add(new AddMoviePanel());
            add.setSize(600, 150);
            add.setVisible(true);
        }

    }
   
}
