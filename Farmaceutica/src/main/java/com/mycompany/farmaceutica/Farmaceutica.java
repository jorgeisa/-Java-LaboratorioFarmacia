/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.farmaceutica;

import InterfazUsuario.MostrarClienteFarmaceutico;

public class Farmaceutica {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Cliente cliente1 = new Cliente("Isaac","3628670540101");
        Farmaceutico farmaceutico1 = new Farmaceutico("Isaac2", "3628670540102");
        System.out.println(cliente1.getDatos());
        System.out.println(farmaceutico1.getDatos());
        
        Operacion operacion1 = new Operacion("operacion1", "Esta es la operacion1.");
        Operacion operacion2 = new Operacion("operacion2", "Esta es la operacion2.");
        Operacion operacion3 = new Operacion("operacion3", "Esta es la operacion3.");
        
        System.out.println(operacion1.getDatos());
        System.out.println(operacion2.getDatos());
        System.out.println(operacion3.getDatos());
        
        Medicamento medicamento1 = new Medicamento("Medicamento1", "Sulfametoxazol, Timetroprima", "Tabletas", "1 caja", 15.50);
        Medicamento medicamento2 = new Medicamento("Medicamento2", "Sulfametoxazol, Timetroprima", "Tabletas", "1 caja", 15.50);
        Medicamento medicamento3 = new Medicamento("Medicamento3", "Carbamezapina", "Capsulas", "20 capsulas", 50.60);
        
        System.out.println(medicamento1.getDatos());
        System.out.println(medicamento2.getDatos());
        System.out.println(medicamento3.getDatos());
        
        Pedido pedido1 = new Pedido(1, cliente1, farmaceutico1);
        Pedido pedido2 = new Pedido(2, cliente1, farmaceutico1);
        Pedido pedido3 = new Pedido(3, cliente1, farmaceutico1);
        
        System.out.println(pedido1.getDatos());
        System.out.println(pedido2.getDatos());
        System.out.println(pedido3.getDatos());
        
        Factura factura1 = new Factura(1, pedido1, 50.58);
        Factura factura2 = new Factura(2, pedido2, 51.58);
        Factura factura3 = new Factura(3, pedido3, 52.58);
        
        System.out.println(factura1.getDatos());
        System.out.println(factura2.getDatos());
        System.out.println(factura3.getDatos());
        
        MostrarClienteFarmaceutico ventanaClienteFarma = new MostrarClienteFarmaceutico();
        ventanaClienteFarma.setVisible(true);
    }
}
