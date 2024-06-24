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
public class Detalle_Venta_Producto {

    private Venta venta;
    private List<Venta_producto> lvp;

    public Detalle_Venta_Producto() {
    }

    public Detalle_Venta_Producto(Venta venta, List<Venta_producto> lvp) {
        this.venta = venta;
        this.lvp = lvp;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public List<Venta_producto> getLvp() {
        return lvp;
    }

    public void setLvp(List<Venta_producto> lvp) {
        this.lvp = lvp;
    }

    @Override
    public String toString() {
        String mensaje = "";
        for (int i = 0; i < lvp.size(); i++) {
            mensaje += lvp.get(i);
        }
        return "Detalle_Venta_Producto{" + "venta=" + venta.toString() + ", lvp=" + mensaje + '}';

    }
}