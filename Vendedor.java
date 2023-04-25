/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_2;

import java.util.Scanner;

/**
 *
 * @author ET36
 */
public class Vendedor extends Empleado{
    private double cantVendida;
    private int comision;

    
    public Vendedor(String Nombre, int CUIT, String genero, Direccion direccion, int telefono, int cantHijos, Sueldo sueldo, double cantVendida) {
        super(Nombre, CUIT, genero, direccion, telefono, cantHijos, sueldo);
        this.cantVendida = cantVendida;
    }
    
    public int Comision(){
    int cantventas;
    Scanner entrada=new Scanner(System.in);
    System.out.println("Ingrese la cantidad de ventas");
    cantventas=entrada.nextInt();
    comision=(cantventas*2)/100;
    return comision;
    
    
    }

    public double getCantVendida() {
        return cantVendida;
    }

    public void setCantVendida(double cantVendida) {
        this.cantVendida = cantVendida;
    }

    public double getComision() {
        return comision;
    }



    
}
