/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ET36
 */
public class Sueldo {
    private double obraSocial;
    private double jubilacion;
    private double presentismo;
    private double suBasico;
    private double suNeto;
    private String cargo;
    private AsignacionFamiliar asigFamiliar;

    public Sueldo(double obraSocial, double jubilacion, double presentismo, String cargo) {
        this.obraSocial = obraSocial;
        this.jubilacion = jubilacion;
        this.presentismo = presentismo;
        this.suBasico = suBasico;
        this.suNeto = suNeto;
        this.cargo = cargo;
        this.asigFamiliar = asigFamiliar;
    }
    public double suBasico()
    {
        double sB = 0.0;
        if (cargo.equals ("Repostero/a")){
            sB = 110000;
            if (genero.equals ("Hombre")){
                sB = 110000 +  10*100/sB;
            }
            
        }
        if (cargo.equals ("Vendedor/a")){
            sB = 70000;
            
        }
        if (cargo.equals ("Panadero/a")){
            sB = 98000;
            
        }
        return sB;
    }
    public void emitirDetalle()
    {
        System.out.println("OBRA SOCIAL: "+ this.obraSocial + " JUBILACION: "+ this.jubilacion+" PRESENTISMO: "+this.presentismo+" CARGO: "+ this.cargo+" ASIGNACION FAMILIAR: "+ this.asigFamiliar.asigFamiliar());
    }
    public void suNeto()
    {
        
    }
    

        
    
    
}
