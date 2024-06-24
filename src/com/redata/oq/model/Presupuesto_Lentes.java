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
    public class Presupuesto_Lentes {
    int idPresupuestoLentes;
    int alturaOblea;
    Mica mica;
    Material material;
    Armazon armazon;
    List <Presupuesto_Lentes_Tratamiento> presupuesto_lentes_tratamiento;
    

    public Presupuesto_Lentes() {
    }

    public Presupuesto_Lentes(int idPresupuestoLentes, int alturaOblea, Mica mica, Material material, Armazon armazon, List<Presupuesto_Lentes_Tratamiento> presupuesto_lentes_tratamiento) {
        this.idPresupuestoLentes = idPresupuestoLentes;
        this.alturaOblea = alturaOblea;
        this.mica = mica;
        this.material = material;
        this.armazon = armazon;
        this.presupuesto_lentes_tratamiento = presupuesto_lentes_tratamiento;
    }

    public int getIdPresupuestoLentes() {
        return idPresupuestoLentes;
    }

    public void setIdPresupuestoLentes(int idPresupuestoLentes) {
        this.idPresupuestoLentes = idPresupuestoLentes;
    }

    public int getAlturaOblea() {
        return alturaOblea;
    }

    public void setAlturaOblea(int alturaOblea) {
        this.alturaOblea = alturaOblea;
    }

    public Mica getMica() {
        return mica;
    }

    public void setMica(Mica mica) {
        this.mica = mica;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Armazon getArmazon() {
        return armazon;
    }

    public void setArmazon(Armazon armazon) {
        this.armazon = armazon;
    }

    public List<Presupuesto_Lentes_Tratamiento> getPresupuesto_lentes_tratamiento() {
        return presupuesto_lentes_tratamiento;
    }

    public void setPresupuesto_lentes_tratamiento(List<Presupuesto_Lentes_Tratamiento> presupuesto_lentes_tratamiento) {
        this.presupuesto_lentes_tratamiento = presupuesto_lentes_tratamiento;
    }

    @Override
    public String toString() {
        return "Presupuesto_Lentes{" + "idPresupuestoLentes=" + idPresupuestoLentes + ", alturaOblea=" + alturaOblea + ", mica=" + mica + ", material=" + material + ", armazon=" + armazon + ", presupuesto_lentes_tratamiento=" + presupuesto_lentes_tratamiento + '}';
    }

    
    
}
