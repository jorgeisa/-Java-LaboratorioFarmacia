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

public class Farmaceutico extends Persona{

    public Farmaceutico(String nombre, String dpi) {
        super(nombre, dpi);
    }
    
    public Farmaceutico(){
        super("","");
    }
    
    public void registrarFarmaceutico(String dpi, String nombre){
        Conexion objConexion = new Conexion();
        String consulta = "INSERT INTO Farmaceutico(dpi, nombre) VALUES (?,?);";
        
        try {
            CallableStatement cs = objConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, dpi);
            cs.setString(2, nombre);
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se agrego el Farmaceutico/Empleado.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el registro de Farmaceutico.");
            System.out.println("Hubo un error en el registro de Empleado");
            System.out.println(e.toString());
        }
    }
    
    public void mostrarFarmaceuticos(JTable tableFarmaceuticos){
        Conexion objConexion = new Conexion();
        
        // Dandole un modelo para ordenar a la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> ordenarTabla = new TableRowSorter<TableModel>(modelo);
        tableFarmaceuticos.setRowSorter(ordenarTabla);
        
        // Agregando Columnas
        modelo.addColumn("DPI");
        modelo.addColumn("Nombre");
                
        String consulta = "SELECT * FROM Farmaceutico;";
        String [] datos = new String[2];
        Statement st; // Preparando para ejecutar
        
        try {
            st = objConexion.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                
                modelo.addRow(datos);
            }
            tableFarmaceuticos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los Farmaceuticos.");
            System.out.println(e.toString());
        }
    }
    
}
