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
public class Nodo_Producto {

          public int id_Producto;
          public String nombre;
          public String marca;
          public int cantidad;
          public String tipo;
          public Boolean disponible;
          public Nodo_Producto siguiente;
          public Nodo_Producto anterior;

          public Nodo_Producto(int id_Producto, String nombre, String marca, int cantidad, String tipo, Boolean disponible) {
                    this.id_Producto = id_Producto;
                    this.nombre = nombre;
                    this.marca = marca;
                    this.cantidad = cantidad;
                    this.tipo = tipo.toUpperCase();
                    this.disponible = disponible;
          }

          public Nodo_Producto() {
          }

}
