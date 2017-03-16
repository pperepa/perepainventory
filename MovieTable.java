package perepainventory;

import javax.swing.*;

/**
 *
 * @author Pranav
 */
public class MovieTable extends JTable
{
    public String[] columnNames = new String[4];
    public Movie[][] movies;
    
    public MovieTable()
    {
       String a = "Name";
       String b = "Nationality";
       String c = "Genre";
       String d = "Year";
       columnNames[0] = a;
       columnNames[1] = b;
       columnNames[2] = c;
       columnNames[3] = d;
       
       JTable table = new JTable(movies, columnNames);
       table.setVisible(true);
        
    }
}
