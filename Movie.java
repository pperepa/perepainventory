package perepainventory;

import javax.swing.*;

/**
 * @author Pranav
 */
public class Movie 
{
    String name;
    String nationality;
    String genre;
    String year;
    
    public Movie()
    {
    }
    public Movie(String title, String origin, String type, String release)
    {
        name = title;
        nationality = origin;
        genre = type;
        year = release;
    }
    
    public void edit()
    {
        JFrame edit = new JFrame();
        edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        edit.getContentPane().add(new MovieEditPanel());
        edit.setSize(500, 500);
        edit.setVisible(true);
    }
    public String getName()
    {
       return name;
    }
    
    public void changeName(String newName)
    {
        name = newName;
    }
    
    public Movie display()
    {
        Movie temp = new Movie(name, nationality, genre, year);
        return temp;
    }
}
