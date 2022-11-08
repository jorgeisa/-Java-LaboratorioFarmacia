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
    
    public Pedido(){
        
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
    
    public void iniciarPedido(String dpiCliente, String dpiFarmaceutico){
        Conexion objConexion = new Conexion();
        String consulta = "INSERT INTO Pedido (cliente_llave, farmaceutico_llave) VALUES (?,?);";
        
        try {
            CallableStatement cs = objConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, dpiCliente);
            cs.setString(2, dpiFarmaceutico);
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se inicio el pedido.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar el pedido.");
            System.out.println("Hubo un error al iniciar el pedido");
            System.out.println(e.toString());
        }
    }
    
    public void agregarProductoAPedido(String idMedicamento, String idPedido){
        Conexion objConexion = new Conexion();
        String consulta = "INSERT INTO Medicamento_Pedido(medicamento_llave, pedido_llave) \n" +
                           "VALUES (?,?);";
        
        try {
            CallableStatement cs = objConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, idMedicamento);
            cs.setString(2, idPedido);
            
            cs.execute();
            JOptionPane.showMessageDialog(null, "Se agrego el medicamento al pedido.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el producto al pedido.");
            System.out.println("Hubo un error al agregar el producto");
            System.out.println(e.toString());
        }
    }
    
    public void mostrarPedidos(JTable tablePedidos){
        Conexion objConexion = new Conexion();
        
        // Dandole un modelo para ordenar a la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> ordenarTabla = new TableRowSorter<TableModel>(modelo);
        tablePedidos.setRowSorter(ordenarTabla);
        
        // Agregando Columnas
        modelo.addColumn("ID Pedido");
        modelo.addColumn("DPI Cliente");
        modelo.addColumn("DPI Farmaceutico/Empleado");
                
        String consulta = "SELECT ped.id, cli.dpi AS dpi_cliente, farma.dpi AS dpi_farmaceutico FROM Pedido AS ped\n" + 
                "INNER JOIN Cliente AS cli ON cli.dpi = ped.cliente_llave\n" +
                "INNER JOIN Farmaceutico AS farma ON farma.dpi = ped.farmaceutico_llave;";
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
            tablePedidos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los Pedidos.");
            System.out.println(e.toString());
        }
    }
    
    public void mostrarMedicamentosEnPedidos(JTable tableMedicamentosPedidos){
        Conexion objConexion = new Conexion();
        
        // Dandole un modelo para ordenar a la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> ordenarTabla = new TableRowSorter<TableModel>(modelo);
        tableMedicamentosPedidos.setRowSorter(ordenarTabla);
        
        // Agregando Columnas
        modelo.addColumn("ID Pedido");
        modelo.addColumn("ID Medicamento");
        modelo.addColumn("Nombre Medic.");
        modelo.addColumn("Presentacion Medic.");
        modelo.addColumn("Precio Medic.");
        
                
        String consulta = "SELECT medped.pedido_llave, medped.medicamento_llave, med.nombre, med.presentacion, med.precio FROM Medicamento_Pedido AS medped\n" +
                          "INNER JOIN Medicamento AS med ON med.id = medped.medicamento_llave;";
        String [] datos = new String[5];
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
                
                modelo.addRow(datos);
            }
            tableMedicamentosPedidos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los Productos en Pedidos.");
            System.out.println(e.toString());
        }
    }
    
    
}
