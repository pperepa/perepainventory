package perepainventory;
import javax.swing.*;
/**
 * @author Pranav
 */
public class PerepaInventory {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
         JFrame frame = new JFrame("Perepa Inventory");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
          JTabbedPane options = new JTabbedPane();
          options.addTab("Home", new HomePanel());
          options.addTab("Movies", new MoviesPanel());
          options.addTab("Books", new BooksPanel());
          options.addTab("Technology", new TechnologyPanel());
          options.addTab("Items", new ItemsPanel());
          options.addTab("Audio Tapes", new AudioTapesPanel());
          options.addTab("Cassettes", new CassettesPanel());
          options.addTab("Software", new SoftwarePanel());
          options.addTab("Sales Deck", new SalesDeckPanel());
          frame.getContentPane().add(options);
          
          frame.setSize(1000, 900);
          frame.setVisible(true);
         
    }
}
