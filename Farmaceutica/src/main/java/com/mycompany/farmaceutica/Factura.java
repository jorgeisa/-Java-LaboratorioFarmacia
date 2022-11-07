/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmaceutica;

import java.time.LocalDate;


public class Factura {
    private int id;
    private Pedido pedido;
    private String fecha;
    private double totalPagar;

    public Factura(int id, Pedido pedido, double totalPagar) {
        this.id = id;
        this.pedido = pedido;
        this.fecha = LocalDate.now().toString();
        this.totalPagar = totalPagar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    public String getDatos() {
        return "Factura: " + "Id: " + id + " - Pedido: " + pedido + " - Fecha: " + fecha + " - TotalPagar: " + totalPagar;
    }
    
    
    
    
    
}
