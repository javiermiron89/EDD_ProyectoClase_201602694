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
public class Matriz_Dispersa {
          // ------------------------------------------------------------------------------------------
          //Varibles de matriz
          private Nodo_Matriz_Dispersa inicioFila;
          private Nodo_Matriz_Dispersa inicioColumna;
          // ------------------------------------------------------------------------------------------
          //Variables comunes

          public void Matriz_Dispersa(){
                    inicioFila = new Nodo_Matriz_Dispersa(-1, 0, 0, "");
                    inicioColumna = new Nodo_Matriz_Dispersa(0, -1, 0, "");
          }
          
          public void agregar(int fil, int col, int id, String nombre){
                    try {
                              Nodo_Matriz_Dispersa nuevoInterno = new Nodo_Matriz_Dispersa(fil, col, id, nombre);
                              Nodo_Matriz_Dispersa nuevaFila = new Nodo_Matriz_Dispersa(fil, -1, id, nombre);
                              Nodo_Matriz_Dispersa nuevaColumna = new Nodo_Matriz_Dispersa(-1, col, id, nombre);
                              //Se ingresan las filas y columnas
                              crearFila(inicioFila, nuevaFila, fil);
                    } catch (Exception e) {
                              System.out.println("ERROR AL INGRESAR EL NODO EN LA MATRIZ");
                    }
          }
          
          private void crearFila(Nodo_Matriz_Dispersa inicioFila, Nodo_Matriz_Dispersa nuevaFila, int fila){
                    Nodo_Matriz_Dispersa temporal = inicioFila;
                    if (inicioFila == null) {
                              while (temporal != null && temporal.abajo != null && temporal.abajo.fila <= fila) {                                        
                                        temporal = temporal.abajo;
                              }
                              //Si la fila tiene un valor menor a una ya existente, se ingresa antes
                              if (temporal.fila < fila) {
                                        ///Si se encuentra null, quiere decir que se inserta como primer nodo
                                        if (temporal.abajo == null) {
                                                  temporal.abajo = nuevaFila;
                                                  nuevaFila.arriba = temporal;
                                        } else {
                                        }
                              }
                    } else {
                              inicioFila = nuevaFila;
                    }
          }
          
          
}
