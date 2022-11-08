/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmaceutica;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Operacion {
    private String nombre;
    private String descripcion;

    public Operacion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public Operacion(){
        
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void registrarOperacion(String nombreOperacion, String descripcionOperacion){
        Conexion objConexion = new Conexion();
        String consulta = "INSERT INTO Operacion(nombre, descripcion) VALUES (?,?);";
        System.out.println(consulta);
        try {
            CallableStatement cs = objConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, nombreOperacion);
            cs.setString(2, descripcionOperacion);
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se agrego la operación.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el registro de operación.");
            System.out.println("Hubo un error en el registro de Operación");
            System.out.println(e.toString());
        }
    }
    
    public void mostrarOperaciones(JTable tableOperaciones){
        Conexion objConexion = new Conexion();
        
        // Dandole un modelo para ordenar a la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> ordenarTabla = new TableRowSorter<TableModel>(modelo);
        tableOperaciones.setRowSorter(ordenarTabla);
        
        // Agregando Columnas
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripción");
                
        String consulta = "SELECT * FROM Operacion;";
        String [] datos = new String[3];
        Statement st; // Preparando para ejecutar
        
        try {
            st = objConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            tableOperaciones.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar las operaciones.");
            System.out.println(e.toString());
        }
    }

    
    public String getDatos() {
        return "Operacion: " + " Nombre: " + nombre + " - " + "Descripcion: " + descripcion;
    }
    
    
}
