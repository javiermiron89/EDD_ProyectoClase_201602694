/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author javier
 */
public class Nodo_Cliente {
          public int nit;
          public String nombre;
          public String apellido;
          public String direccion;
          public int telefono;
          public String fecha_nacimiento;
          public Nodo_Cliente siguiente;
          public Nodo_Cliente anterior;

          public Nodo_Cliente(int nit, String nombre, String apellido, String direccion, int telefono, String fecha_nacimiento) {
                    this.nit = nit;
                    this.nombre = nombre;
                    this.apellido = apellido;
                    this.direccion = direccion;
                    this.telefono = telefono;
                    this.fecha_nacimiento = fecha_nacimiento;
          }

          public Nodo_Cliente() {
                    //Unicamente utilizado para nodos temporales
          }
}
