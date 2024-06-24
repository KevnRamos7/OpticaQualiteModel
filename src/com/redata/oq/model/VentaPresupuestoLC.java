/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redata.oq.model;

/**
 *
 * @author kevin
 */
public class VentaPresupuestoLC {
    PresupuestoLC presupuestoLC;
    int Cantidad;
    int precioUnitario;
    int descuento;

    public VentaPresupuestoLC() {
    }

    public VentaPresupuestoLC(PresupuestoLC presupuestoLC, int Cantidad, int precioUnitario, int descuento) {
        this.presupuestoLC = presupuestoLC;
        this.Cantidad = Cantidad;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
    }

    public PresupuestoLC getPresupuestoLC() {
        return presupuestoLC;
    }

    public void setPresupuestoLC(PresupuestoLC presupuestoLC) {
        this.presupuestoLC = presupuestoLC;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "VentaPresupuestoLC{" + "presupuestoLC=" + presupuestoLC + ", Cantidad=" + Cantidad + ", precioUnitario=" + precioUnitario + ", descuento=" + descuento + '}';
    }
    
    
}
