/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_2;

/**
 *
 * @author ET36
 */
public class Sueldo {
    private double obraSocial;
    private double jubilacion;
    private double presentismo;
    private double sB;
    private char genero;
    private String cargo;
    private AsignacionFamiliar asigFamiliar;
    private Vendedor vendedor;

    public Sueldo(double obraSocial, double jubilacion, double presentismo, String cargo, AsignacionFamiliar af, char g, Vendedor v) {
        this.obraSocial = obraSocial;
        this.jubilacion = jubilacion;
        this.presentismo = presentismo;
        this.cargo = cargo;
        this.genero = g;
        this.sB = suBasico();
        this.asigFamiliar = af;
        this.vendedor = v;
    }
    public double suBasico()
    {
        double sB = 0.0;
        if (cargo.equals ("Repostero")){
            sB = 110000;
            if (genero == 'h'){
                sB = 110000 +  10*100/sB;
            }
            
        }
        if (cargo.equals ("Vendedor")){
            sB = 70000 + this.vendedor.Comision();
            
        }
        if (cargo.equals ("Panadero")){
            sB = 98000;
    
        }
        return sB;
    }
    public void emitirDetalle()
    {
        System.out.println("OBRA SOCIAL: "+ this.obraSocial + " JUBILACION: "+ this.jubilacion+" PRESENTISMO: "+this.presentismo+" CARGO: "+ this.cargo+" ASIGNACION FAMILIAR: "+ this.asigFamiliar.totalAF()+ " SUELDO NETO: "+ this.suNeto());
    }
    public double suNeto()
    {
        double sN = 0.0;
        sN = sB - 3*100/sB - 11*100/sB + 10*100/sB + this.asigFamiliar.totalAF();
        return sN;
    }

    public double getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(double obraSocial) {
        this.obraSocial = obraSocial;
    }

    public double getJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(double jubilacion) {
        this.jubilacion = jubilacion;
    }

    public double getPresentismo() {
        return presentismo;
    }

    public void setPresentismo(double presentismo) {
        this.presentismo = presentismo;
    }

    public double getsB() {
        return sB;
    }

    public void setsB(double sB) {
        this.sB = sB;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


 
}
