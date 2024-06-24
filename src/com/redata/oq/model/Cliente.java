/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.redata.oq.model;


public class Cliente {
    
    
    private int idCliente;
    private String numeroUnico;
    private int estatus;
    Persona persona;

    public Cliente() {
    }
    
    

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.idCliente = IdCliente;
    }

    public String getNumeroUnico() {
        return numeroUnico;
    }

    public void setNumeroUnico(String NumeroUnico) {
        this.numeroUnico = NumeroUnico;
    }
    
    public Persona getPersona()
    {
        return persona;
    }

    public void setPersona(Persona persona)
    {
        this.persona = persona;
    }
    
}