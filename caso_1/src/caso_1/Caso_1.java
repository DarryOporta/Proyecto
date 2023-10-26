package caso_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Darry OV
 */
public class Caso_1 {

    public static void main(String[] args) {

        int cantFac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas a registrar: "));
        int cuotaMen = 0;
        boolean existe = true;
        double totalFinal = 0;
        Factura[] fac = new Factura[cantFac];

        String name = JOptionPane.showInputDialog("Ingrese el Nombre del cliente: ");
        int ced = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliennte:"));
        int anioFac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la factura: "));

        for (int i = 0; i < cantFac; i++) {

            fac[i] = new Factura();

            fac[i].setCed(ced);

            fac[i].setName(name);

            fac[i].setAnioFac(anioFac);

            int mesFac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes de la factura del 1 al 6: "));
            fac[i].setMesFac(mesFac);

            double montFac = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la factura: "));
            fac[i].setMontFac(montFac);

            int estado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estado de la factura pagado(1) no pagada (2): "));
            fac[i].setEstado(estado);

            int numFac = 1000 + (int) (Math.random() * 90000);
            fac[i].setNumFac(numFac);

            System.out.println("Cedula: " + fac[i].ced + " Nombre: " + fac[i].name + " Factura: " + fac[i].numFac + " Mes: " + fac[i].mesFac + " Anio: " + fac[i].anioFac + " Monto: " + fac[i].montFac + " Estado factura: " + fac[i].estado);

            double totalApagar = 0;

            for (int j = 0; j < i; j++) {
                if (fac[i].getEstado() == 2) {

                    totalApagar = totalApagar + fac[i].getMontFac();

                }
            }

            totalFinal = ((totalApagar * 0.05) + totalApagar) / 6;

            System.out.print("\n");

            

        }
        System.out.print("\nCuota 1= " + totalFinal + " Fecha de pago Julio 2023 ");
        System.out.print("\nCuota 2= " + totalFinal + " Fecha de pago Agosto 2023 ");
        System.out.print("\nCuota 3= " + totalFinal + " Fecha de pago Septiembre 2023 ");
        System.out.print("\nCuota 4= " + totalFinal + " Fecha de pago Octubre 2023 ");
        System.out.print("\nCuota 5= " + totalFinal + " Fecha de pago Noviembre 2023 ");
        System.out.print("\nCuota 6= " + totalFinal + " Fecha de pago Diciembre 2023 ");
    }

}
