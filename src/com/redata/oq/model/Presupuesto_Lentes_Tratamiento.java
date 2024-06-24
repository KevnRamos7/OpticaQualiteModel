/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redata.oq.model;

/**
 *
 * @author kevin
 */
public class Presupuesto_Lentes_Tratamiento {
    Presupuesto_Lentes presupuesto_lentes;
    Tratamiento tratamiento;

    public Presupuesto_Lentes_Tratamiento() {
    }

    public Presupuesto_Lentes_Tratamiento(Presupuesto_Lentes presupuesto_lentes, Tratamiento tratamiento) {
        this.presupuesto_lentes = presupuesto_lentes;
        this.tratamiento = tratamiento;
    }

    public Presupuesto_Lentes getPresupuesto_lentes() {
        return presupuesto_lentes;
    }

    public void setPresupuesto_lentes(Presupuesto_Lentes presupuesto_lentes) {
        this.presupuesto_lentes = presupuesto_lentes;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
}
