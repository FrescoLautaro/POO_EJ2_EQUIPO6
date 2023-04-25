/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_2;

/**
 *
 * @author ET36
 */
public class AsignacionFamiliar {
    private double valorHijo;
    private int cantHijo;

    public AsignacionFamiliar(double valorHijo, int cantHijos) {
        this.valorHijo = valorHijo;
        this.cantHijo = cantHijos;
    }
   

    public double getValorHijo() {
        return valorHijo;
    }

    public void setValorHijo(double valorHijo) {
        this.valorHijo = valorHijo;
    }

    public int getCantHijo() {
        return cantHijo;
    }

    public void setCantHijo(int cantHijo) {
        this.cantHijo = cantHijo;
    }

    public double totalAF()
    {
        double af = this.cantHijo * this.valorHijo;
        return af;
    }
}
