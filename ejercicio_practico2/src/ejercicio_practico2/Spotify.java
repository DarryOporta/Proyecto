package ejercicio_practico2;

import javax.swing.JOptionPane;

/**
 *
 * @author Darry OV
 */
public class Spotify {
    
    public String id;
    public String title;
    public String author;
    public String duration;
    public int year;

    public void setId() {
        this.id = JOptionPane.showInputDialog("Ingrese el id de la canción: ");
    }

    public void setTitle() {
        this.title = JOptionPane.showInputDialog("Ingrese el titulo de la canción: ");
    }

    public void setAuthor() {
        this.author = JOptionPane.showInputDialog("Ingrese el autor de la canción: ");
    }

    public void setDuration() {
        this.duration = JOptionPane.showInputDialog("Ingrese la duracion de la canción: ");
    }

    public void setYear() {
        this.year = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la canción: "));
    }


    
}
