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
public class Nodo_Matriz_Dispersa {
          public int fila;
          public int columna;
          public int id_factura;
          public int cantidad;
          public String nombre;
          Nodo_Matriz_Dispersa derecha;
          Nodo_Matriz_Dispersa izquierda;
          Nodo_Matriz_Dispersa arriba;
          Nodo_Matriz_Dispersa abajo;          
          
          public Nodo_Matriz_Dispersa(int fila, int columna, int id_factura, int cantidad, String nombre){
                    this.fila = fila;
                    this.columna = columna;
                    this.id_factura = id_factura;
                    this.cantidad = cantidad;
                    this.nombre = nombre;
          }
}
