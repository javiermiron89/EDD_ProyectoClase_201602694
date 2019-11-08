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
          
          void agregar(){
          
          }
}
