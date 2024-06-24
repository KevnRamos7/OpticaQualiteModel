/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redata.oq.model;

/**
 *
 * @author kevin
 */
public class Presupuesto {
    int idPresupuesto;
    ExamenVista ExamenVista;
    String clave;
    Presupuesto_Lentes presupuesto_lentes;

    public Presupuesto() {
    }

    public Presupuesto(int idPresupuesto, ExamenVista ExamenVista, String clave, Presupuesto_Lentes presupuesto_lentes) {
        this.idPresupuesto = idPresupuesto;
        this.ExamenVista = ExamenVista;
        this.clave = clave;
        this.presupuesto_lentes = presupuesto_lentes;
    }

    public int getIdPresupuesto() {
        return idPresupuesto;
    }

    public void setIdPresupuesto(int idPresupuesto) {
        this.idPresupuesto = idPresupuesto;
    }

    public ExamenVista getExamenVista() {
        return ExamenVista;
    }

    public void setExamenVista(ExamenVista ExamenVista) {
        this.ExamenVista = ExamenVista;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Presupuesto_Lentes getPresupuesto_lentes() {
        return presupuesto_lentes;
    }

    public void setPresupuesto_lentes(Presupuesto_Lentes presupuesto_lentes) {
        this.presupuesto_lentes = presupuesto_lentes;
    }

    @Override
    public String toString() {
        return "Presupuesto{" + "idPresupuesto=" + idPresupuesto + ", ExamenVista=" + ExamenVista + ", clave=" + clave + ", presupuesto_lentes=" + presupuesto_lentes + '}';
    }

    
    
    
}
