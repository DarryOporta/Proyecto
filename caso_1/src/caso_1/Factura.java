package caso_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Darry OV
 */
public class Factura {
    
    public String name;
    public int ced;
    public int numFac; 
    public double montFac;
    public int mesFac;
    public int anioFac;
    public int estado;

    public String getName() {
        return name ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced = ced;
    }

    public int getNumFac() {
        return numFac;
    }

    public void setNumFac(int numFac) {
        this.numFac = numFac;
    }

    public double getMontFac() {
        return montFac;
    }

    public void setMontFac(double montFac) {
        this.montFac = montFac;
    }

    public int getMesFac() {
        return mesFac;
    }

    public void setMesFac(int mesFac) {
        this.mesFac = mesFac;
    }

    public int getAnioFac() {
        return anioFac;
    }

    public void setAnioFac(int anioFac) {
        this.anioFac = anioFac;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
