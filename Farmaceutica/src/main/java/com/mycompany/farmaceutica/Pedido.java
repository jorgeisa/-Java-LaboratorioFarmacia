/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmaceutica;

import java.util.ArrayList;

public class Pedido {
    
    private int numeroPedido;
    private Persona cliente;
    private Persona farmaceutico;
    private ArrayList<Medicamento> medicamentos;

    public Pedido(int numeroPedido, Persona cliente, Persona farmaceutico) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.farmaceutico = farmaceutico;
        this.medicamentos = new ArrayList<Medicamento>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Persona getFarmaceutico() {
        return farmaceutico;
    }

    public void setFarmaceutico(Persona farmaceutico) {
        this.farmaceutico = farmaceutico;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    public String getDatos() {
        return "Pedido: " + "NumeroPedido: " + numeroPedido + " - Cliente: " + cliente.getNombre() + " - Farmaceutico: " + farmaceutico.getNombre() + " - Medicamentos: " + medicamentos;
    }
    
    
}
