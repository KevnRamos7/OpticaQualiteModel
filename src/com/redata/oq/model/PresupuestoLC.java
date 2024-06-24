/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redata.oq.model;

/**
 *
 * @author kevin
 */
public class PresupuestoLC {
    int idPresupuestoLC;
    Presupuesto presupuesto;
    ExamenVista examenVista;
    LenteContacto LenteContacto;
    String clave;

    public PresupuestoLC() {
    }

    public PresupuestoLC(int idPresupuestoLC, Presupuesto presupuesto, ExamenVista examenVista, LenteContacto LenteContacto, String clave) {
        this.idPresupuestoLC = idPresupuestoLC;
        this.presupuesto = presupuesto;
        this.examenVista = examenVista;
        this.LenteContacto = LenteContacto;
        this.clave = clave;
    }

    public int getIdPresupuestoLC() {
        return idPresupuestoLC;
    }

    public void setIdPresupuestoLC(int idPresupuestoLC) {
        this.idPresupuestoLC = idPresupuestoLC;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ExamenVista getExamenVista() {
        return examenVista;
    }

    public void setExamenVista(ExamenVista examenVista) {
        this.examenVista = examenVista;
    }

    public LenteContacto getLenteContacto() {
        return LenteContacto;
    }

    public void setLenteContacto(LenteContacto LenteContacto) {
        this.LenteContacto = LenteContacto;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "PresupuestoLC{" + "idPresupuestoLC=" + idPresupuestoLC + ", presupuesto=" + presupuesto + ", examenVista=" + examenVista + ", LenteContacto=" + LenteContacto + ", clave=" + clave + '}';
    }
    
    
}
