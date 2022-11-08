/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmaceutica;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

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
    
    public Medicamento(){
        
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
    
    public void registrarMedicamento(String nombre, String sustancia, String forma, String presentacion, String precio){
        Conexion objConexion = new Conexion();
        String consulta = "INSERT INTO Medicamento(nombre, sustancia, forma, presentacion, precio) " +
        "VALUES (?,?,?,?,?);";
        
        try {
            CallableStatement cs = objConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, nombre);
            cs.setString(2, sustancia);
            cs.setString(3, forma);
            cs.setString(4, presentacion);
            cs.setString(5, precio);
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se agrego el medicamento.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el registro de Medicamento.");
            System.out.println("Hubo un error en el registro de Medicamento");
            System.out.println(e.toString());
        }
    }
    
    public void mostrarMedicamentos(JTable tableMedicamentos){
        Conexion objConexion = new Conexion();
        
        // Dandole un modelo para ordenar a la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> ordenarTabla = new TableRowSorter<TableModel>(modelo);
        tableMedicamentos.setRowSorter(ordenarTabla);
        
        // Agregando Columnas
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Sustancia");
        modelo.addColumn("Forma");
        modelo.addColumn("Presentacion");
        modelo.addColumn("Precio");
                
        String consulta = "SELECT * FROM Medicamento;";
        String [] datos = new String[6];
        Statement st; // Preparando para ejecutar
        
        try {
            st = objConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            tableMedicamentos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar las operaciones.");
            System.out.println(e.toString());
        }
    }
    
    public String getDatos() {
        return "Medicamento: " + "Nombre: " + nombre + "- Sustancia: " + sustancia + "- Forma: " + forma + "- Presentacion: " + presentacion + "- Precio: " + precio + "- Operaciones: " + operaciones;
    }
}
