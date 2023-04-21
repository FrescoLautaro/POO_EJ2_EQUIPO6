/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2;

/**
 *
 * @author ET36
 */
public class Empleado {
    private String Nombre;
    private int CUIT;
    private String genero;
    private Direccion direccion;
    private int telefono;
    private int cantHijos;
    private Sueldo sueldo;

    public Empleado(String Nombre, int CUIT, String genero, Direccion direccion, int telefono, int cantHijos, Sueldo sueldo) {
        this.Nombre = Nombre;
        this.CUIT = CUIT;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantHijos = cantHijos;
        this.sueldo = sueldo;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCUIT() {
        return CUIT;
    }

    public void setCUIT(int CUIT) {
        this.CUIT = CUIT;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public Sueldo getSueldo() {
        return sueldo;
    }

    public void setSueldo(Sueldo sueldo) {
        this.sueldo = sueldo;
    }
    
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+ this.Nombre+ "CUIT: "+ this.CUIT+ "Genero: "+ this.genero+ "Direccion: "+this.direccion+
         "Telefono: " +this.telefono+"Cantidad hijos"+this.cantHijos+"Sueldo"+this.sueldo.emitirDetalle());
    
    };
 
}



