package cs3_p5;

import javax.swing.JOptionPane;

public class Cs3_p5 {

    public static void main(String[] args) {
        //Declaracion de variables 
        String lectura;
        int c_est , nota;
        int c_est_a = 0, not_prom = 0, not_max = 0, nota_min = 101;
        
        //Asignacion de valores
        lectura =JOptionPane.showInputDialog("Inserte la cantidad de estudiantes a calificar: ");
        c_est = Integer.parseInt(lectura);
        
        //Condicionales 
        for (int i = 1; i <= c_est; i++)
        {
            lectura =JOptionPane.showInputDialog("Dijite la nota de estudiante N "+ i );
            nota = Integer.parseInt(lectura);
            not_prom = not_prom + nota / c_est;
            
            if (nota < nota_min)
            {
                nota_min = nota;  
            }
            
            if (nota > not_max)
            {
                not_max = nota;
            }
            
            if (nota >= 70 )
            {
                c_est_a += 1; 
            }
            
        }
        JOptionPane.showMessageDialog(null,"El total de estudiantes a calificar es de: " + c_est +"\nEl total de estudiantes aprobados es de:" + c_est_a +"\nEl promedio de las notas es de: " + not_prom +"\nLa nota minima es de:"+ nota_min + "\nLa nota maxima es de: "+not_max);
    }
    
}
