/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redata.oq.model;

/**
 *
 * @author kevin
 */
public class VentaPresupuesto {
     PresupuestoLC presupuestoLC;
     private Presupuesto presupuesto;
     private int cantidad;
     private float precioUnitario;
     private float descuento;

    public VentaPresupuesto() {
    }

    public VentaPresupuesto(PresupuestoLC presupuestoLC, Presupuesto presupuesto, int cantidad, float precioUnitario, float descuento) {
        this.presupuestoLC = presupuestoLC;
        this.presupuesto = presupuesto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.descuento = descuento;
    }

    public PresupuestoLC getPresupuestoLC() {
        return presupuestoLC;
    }

    public void setPresupuestoLC(PresupuestoLC presupuestoLC) {
        this.presupuestoLC = presupuestoLC;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    
    
     
     
}
