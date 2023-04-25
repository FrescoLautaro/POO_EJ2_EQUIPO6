/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_2;

/**
 *
 * @author ET36
 */
public class ReciboSueldo {
    private Empleado empleado;
    private Sueldo sueldo;
    
    public ReciboSueldo(Empleado empleado) {
        this.empleado = empleado;
        this.sueldo=sueldo;
    }
   public void Imprimir(){
       this.empleado.mostrarDatos();
       this.sueldo.emitirDetalle();
   }
}


