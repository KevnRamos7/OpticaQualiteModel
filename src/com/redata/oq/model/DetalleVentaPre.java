/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redata.oq.model;

import java.util.List;

/**
 *
 * @author kevin
 */
public class DetalleVentaPre {
    private Venta venta;
    private List <VentaPresupuesto> venta_presupuesto;

    public DetalleVentaPre() {
    }

    public DetalleVentaPre(Venta venta, List<VentaPresupuesto> venta_presupuesto) {
        this.venta = venta;
        this.venta_presupuesto = venta_presupuesto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<VentaPresupuesto> getVenta_presupuesto() {
        return venta_presupuesto;
    }

    public void setVenta_presupuesto(List<VentaPresupuesto> venta_presupuesto) {
        this.venta_presupuesto = venta_presupuesto;
    }

    @Override
    public String toString() {
        return "DetalleVentaPre{" + "venta=" + venta + ", venta_presupuesto=" + venta_presupuesto + '}';
    }

    
    
    
}
