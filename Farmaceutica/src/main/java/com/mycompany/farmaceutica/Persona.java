/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmaceutica;

public abstract class Persona {
    private String nombre;
    private String dpi;

    public Persona(String nombre, String dpi) {
        this.nombre = nombre;
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getDatos(){
        return "Persona: Nombre: " + this.nombre + " - " + "Dpi: " + this.dpi;
    }
}
