package ejercicio_practico2;

import javax.swing.JOptionPane;

public class Ejercicio_practico2 {
  
    public static void main(String[] args) {
        
        Spotify cancion = new Spotify();
        cancion.setId();
        cancion.setTitle();
        cancion.setAuthor();
        cancion.setDuration();
        cancion.setYear();
        
        JOptionPane.showMessageDialog(null, "Nueva canción registrada:\n"+"ID: "+ cancion.id + "\nTitulo: "+ cancion.title+"\nAutor: "+cancion.author+"\nDuración: "+cancion.duration+"\nAño de creación"+cancion.year);
        
    }
    
}
