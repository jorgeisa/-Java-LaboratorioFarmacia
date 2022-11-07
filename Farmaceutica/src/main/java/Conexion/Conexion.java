/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conectar;
    String usuario = "root";
    String contrasena = "passw0rd";
    String bd = "farmaceutica";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ ip + ":" + puerto + "/" + bd;
    
    public Connection establecerConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
            System.out.println("Se conecto correctamente a MySql");
        } catch (Exception e) {
            System.out.println("Problemas al conectar Mysql.");
        }
        return conectar;
    }
}
