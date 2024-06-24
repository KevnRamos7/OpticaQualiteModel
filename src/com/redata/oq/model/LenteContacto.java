/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redata.oq.model;

public class LenteContacto {
    int idLenteContacto;
    int keratometria;
    Producto producto;
    String fotografia;

    public LenteContacto() {
    }

    public LenteContacto(int idLenteContacto, int keratometria, Producto producto, String fotografia) {
        this.idLenteContacto = idLenteContacto;
        this.keratometria = keratometria;
        this.producto = producto;
        this.fotografia = fotografia;
    }

    public int getIdLenteContacto() {
        return idLenteContacto;
    }

    public void setIdLenteContacto(int idLenteContacto) {
        this.idLenteContacto = idLenteContacto;
    }

    public int getKeratometria() {
        return keratometria;
    }

    public void setKeratometria(int keratometria) {
        this.keratometria = keratometria;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    @Override
    public String toString() {
        return "Lentes_Contacto{" + "idLenteContacto=" + idLenteContacto + ", keratometria=" + keratometria + ", producto=" + producto + ", fotografia=" + fotografia + '}';
    }
    
    
    
}