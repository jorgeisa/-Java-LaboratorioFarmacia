/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmaceutica;

import java.util.ArrayList;

public class Medicamento {
    
    private String nombre;
    private String sustancia;
    private String forma;
    private String presentacion;
    private double precio;
    private ArrayList<Operacion> operaciones;

    public Medicamento(String nombre, String sustancia, String forma, String presentacion, double precio) {
        this.nombre = nombre;
        this.sustancia = sustancia;
        this.forma = forma;
        this.presentacion = presentacion;
        this.precio = precio;
        this.operaciones = new ArrayList<Operacion>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSustancia() {
        return sustancia;
    }

    public void setSustancia(String sustancia) {
        this.sustancia = sustancia;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(ArrayList<Operacion> operaciones) {
        this.operaciones = operaciones;
    }
    
    public String getDatos() {
        return "Medicamento: " + "Nombre: " + nombre + "- Sustancia: " + sustancia + "- Forma: " + forma + "- Presentacion: " + presentacion + "- Precio: " + precio + "- Operaciones: " + operaciones;
    }
}
