package ejerciciopractico_1;

import javax.swing.JOptionPane;

public class EjercicioPractico_1 {

    public static void main(String[] args) {

        int cantEmp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados:"));
        double salarioInd;
        double totalFinal;
        double totalSEM;
        double totalIVM;
        double abono = 0.0;

        for (int i = 0; i < cantEmp; i++) {

            salarioInd = Double.parseDouble(JOptionPane.showInputDialog("ingrese el salario del empleado numero: " + (i + 1)));
            double tempSEM = salarioInd * 0.0925;
            double tempIVM = salarioInd * 0.0508;

            abono = tempSEM + tempIVM;
        }
        
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de ₡"+ abono + "por concepto de SEM y IVM");
        
    }

}
