/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author javier
 */
public class Matriz_Dispersa {
          // ------------------------------------------------------------------------------------------
          //Varibles de matriz
          private Nodo_Matriz_Dispersa inicioFila = new Nodo_Matriz_Dispersa(-1, 00, 00, "INICIO F");
          private Nodo_Matriz_Dispersa inicioColumna = new Nodo_Matriz_Dispersa(00, -1, 00, "INICIO C");
          // ------------------------------------------------------------------------------------------
          //Variables comunes

          public void Matriz_Dispersa(){
                    System.out.println("INICIALIZADA LA MATRIZ");
                    inicioFila = new Nodo_Matriz_Dispersa(-1, 0, 0, "INICIO F");
                    inicioColumna = new Nodo_Matriz_Dispersa(0, -1, 0, "INICIO C");
          }
          
          public void agregar(int fil, int col, int id, String nombre){
                    try {
                              Nodo_Matriz_Dispersa nuevoInterno = new Nodo_Matriz_Dispersa(fil, col, id, nombre);
                              Nodo_Matriz_Dispersa nuevaFila = new Nodo_Matriz_Dispersa(fil, -1, 00, "FILA");
                              Nodo_Matriz_Dispersa nuevaColumna = new Nodo_Matriz_Dispersa(-1, col, 00, "COLUMNA");
                              //Se ingresan las filas y columnas
                              crearFila(inicioFila, nuevaFila, fil);
                              crearColumna(inicioColumna, nuevaColumna, col);
                              BuscarYAgregarFila(fil, col, nuevoInterno);
                              BuscarYAgregarColumna(fil, col, nuevoInterno);
                    } catch (Exception e) {
                              System.out.println("ERROR AL INGRESAR EL NODO EN LA MATRIZ");
                    }
          }
          
          void BuscarYAgregarColumna(int fil, int col, Nodo_Matriz_Dispersa nuevo) {
                    Nodo_Matriz_Dispersa actual = inicioColumna.derecha;
                    boolean encontrado = false;
                    while (actual != null && !encontrado) {
                              if (actual.columna == col) {
                                        //NodoOrtogonal temporal = actual;
                                        while (actual.abajo != null && actual.abajo.fila <= fil) {
                                                  actual = actual.abajo;
                                        }
                                        //System.out.println("Revisando valores: " + actual.dato);
                                        if (actual.fila < fil) {
                                                  if (actual.abajo == null) {
                                                            actual.abajo = nuevo;
                                                            actual.abajo.arriba = actual;
                                                  } else {
                                                            Nodo_Matriz_Dispersa nuevo_nodo = nuevo;
                                                            nuevo_nodo.arriba = actual;
                                                            nuevo_nodo.abajo = actual.abajo;
                                                            actual.abajo.arriba = nuevo_nodo;
                                                            actual.abajo = nuevo_nodo;
                                                  }
                                        } else if (actual.fila > fil) {
                                                  System.out.println(actual.fila + " es mayor que " + fil);
                                                  if (actual.abajo == null) {
                                                            actual.abajo = nuevo;
                                                            actual.abajo.arriba = actual;
                                                  } else {
                                                            Nodo_Matriz_Dispersa nuevo_nodo = nuevo;
                                                            nuevo_nodo.arriba = actual;
                                                            nuevo_nodo.abajo = actual.abajo;
                                                            actual.abajo.arriba = nuevo_nodo;
                                                            actual.abajo = nuevo_nodo;

                                                            System.out.println("Arriba: " + nuevo_nodo.arriba.nombre);
                                                            System.out.println("Actual: " + nuevo_nodo.fila + "," + nuevo_nodo.columna + "=" + nuevo_nodo.nombre);
                                                            System.out.println("Abajo: " + nuevo_nodo.abajo.nombre);
                                                  }
                                        } else if (actual.fila == fil) {
                                                  System.out.println("Yo soy el original:" + actual.nombre + ", mi copia es: " + nuevo.nombre);
                                        }
                                        encontrado = true;
                              } else {
                                        //System.out.println("No se encontro el nodo" + "[" + actual.fila + "," + actual.columna + "]");
                              }
                              //System.out.print("[" + actual.fila + "," + actual.columna + "]   ");
                              actual = actual.derecha;
                    }
                    //System.out.println("------------------------------------------------------");
          }

          void BuscarYAgregarFila(int fil, int col, Nodo_Matriz_Dispersa nuevo) {
                    Nodo_Matriz_Dispersa actual = inicioFila.abajo;
                    boolean encontrado = false;
                    while (actual != null && !encontrado) {
                              if (actual.fila == fil) {
                                        //NodoOrtogonal temporal = actual;
                                        while (actual.derecha != null && actual.derecha.columna <= col) {
                                                  actual = actual.derecha;
                                        }
                                        //System.out.println("Revisando valores: " + actual.dato);
                                        if (actual.columna < col) {
                                                  if (actual.derecha == null) {
                                                            actual.derecha = nuevo;
                                                            actual.derecha.izquierda = actual;
                                                  } else {
                                                            Nodo_Matriz_Dispersa nuevo_nodo = nuevo;
                                                            nuevo_nodo.derecha = actual;
                                                            nuevo_nodo.derecha = actual.derecha;
                                                            actual.derecha.izquierda = nuevo_nodo;
                                                            actual.derecha = nuevo_nodo;
                                                  }
                                        } else if (actual.columna > col) {
                                                  if (actual.derecha == null) {
                                                            actual.derecha = nuevo;
                                                            actual.derecha.izquierda = actual;
                                                  } else {
                                                            Nodo_Matriz_Dispersa nuevo_nodo = nuevo;
                                                            nuevo_nodo.izquierda = actual;
                                                            nuevo_nodo.derecha = actual.derecha;
                                                            actual.derecha.izquierda = nuevo_nodo;
                                                            actual.derecha = nuevo_nodo;
                                                  }
                                        } else if (actual.columna == col) {
                                                  //System.out.println("Yo soy el original:" + actual.nombre + ", mi copia es: " + nuevo.nombre);
                                        }
                                        encontrado = true;
                              } else {
                              }
                              actual = actual.abajo;
                    }
                    //System.out.println("**************************************************");
          }

          void crearFila(Nodo_Matriz_Dispersa inicioFila, Nodo_Matriz_Dispersa nuevaFila, int fil) {
                    Nodo_Matriz_Dispersa temporal = inicioFila;
                    if (inicioFila != null) {
                              while (temporal != null && temporal.abajo != null && temporal.abajo.fila <= fil) {
                                        temporal = temporal.abajo;
                              }
                              //Si la fila tiene un valor menor a una ya existente se ingresara el nodo antes
                              if (temporal.fila < fil) {
                                        //Si la fila se encuentra nula quiere decir que se insertara el dato como primer nodo
                                        if (temporal.abajo == null) {
                                                  temporal.abajo = nuevaFila;
                                                  nuevaFila.arriba = temporal;
                                        } else {
                                                  //Ordena los nodos para colocar el valor antes del nodo ya existente y evitar que se pierdan los punteros
                                                  Nodo_Matriz_Dispersa tmpMayor = temporal.abajo;
                                                  nuevaFila.abajo = temporal.abajo;
                                                  nuevaFila.arriba = temporal.arriba;
                                                  temporal.abajo = nuevaFila;
                                                  tmpMayor.arriba = nuevaFila;
                                        }
                              } else if (temporal.fila > fil) {
                                        //Aca es cuando el nodo a ingresar es mayor a los ya existentes
                                        nuevaFila.abajo = temporal;
                                        temporal.arriba = nuevaFila;
                                        inicioFila = nuevaFila;
                              } else {
                                        //sI es igual unicamente lo sobreescribe
                                        nuevaFila = temporal;
                              }
                    } else {
                              inicioFila = nuevaFila;
                    }
          }

          void crearColumna(Nodo_Matriz_Dispersa inicio, Nodo_Matriz_Dispersa nuevaColumna, int col) {
                    Nodo_Matriz_Dispersa temporal = inicio;
                    if (inicio != null) {
                              //NodoOrtagonal *temporalColumna = inicioColumna;

                              //
                              while (temporal != null && (temporal.derecha != null) && (temporal.derecha.columna <= col)) {
                                        temporal = temporal.derecha;
                              }
                              if (temporal.columna < col) {
                                        if (temporal.derecha == null) {
                                                  temporal.derecha = nuevaColumna;
                                                  nuevaColumna.izquierda = temporal;
                                        } else {
                                                  Nodo_Matriz_Dispersa tmpMayor = temporal.derecha;
                                                  nuevaColumna.derecha = temporal.derecha;
                                                  nuevaColumna.izquierda = temporal.izquierda;
                                                  temporal.derecha = nuevaColumna;
                                                  tmpMayor.izquierda = nuevaColumna;
                                        }
                              } else if (temporal.columna > col) {
                                        nuevaColumna.derecha = temporal;
                                        temporal.izquierda = nuevaColumna;
                                        inicio = nuevaColumna;
                              } else {
                                        //nuevaColumna = temporal;
                              }
                    } else {
                              inicio = nuevaColumna;
                    }
          }
          
          public void imprimirMatriz(){
                    //Imprimir mediante filas
                    Nodo_Matriz_Dispersa temp = inicioFila.abajo;
                    if (temp != null) {
                              while(temp != null){
                                        System.out.println("Fila-----------------------------------");
                                        System.out.println("id: " + temp.id + " || fila: " + temp.fila + " || columna: " + temp.columna);
                                        System.out.println("--Dentro:--");
                                        if (temp.derecha != null) {
                                                  Nodo_Matriz_Dispersa temp2 = temp.derecha;
                                                  while(temp2 != null){
                                                            System.out.println("id: " + temp2.id + " || fila: " + temp2.fila + " || columna: " + temp2.columna);
                                                            temp2 = temp2.derecha;
                                                  }
                                        }
                                        temp = temp.abajo;
                              }
                    } else {
                              System.out.println("Esta vacio");
                    }
                    
                    System.out.println("");
                    System.out.println("Ahora por COLUMNAS*********");
                    System.out.println("");
                    
                    Nodo_Matriz_Dispersa tempCol = inicioColumna.derecha;
                    if (tempCol  != null) {
                              while(tempCol != null){
                                        System.out.println("Columna-----------------------------------");
                                        System.out.println("id: " + tempCol.id + " || fila: " + tempCol.fila + " || columna: " + tempCol.columna);
                                        System.out.println("--Dentro:--");
                                        if (tempCol.abajo != null) {
                                                  Nodo_Matriz_Dispersa temp2 = tempCol.abajo;
                                                  while(temp2 != null){
                                                            System.out.println("id: " + temp2.id + " || fila: " + temp2.fila + " || columna: " + temp2.columna);
                                                            temp2 = temp2.abajo;
                                                  }
                                        }
                                        tempCol = tempCol.derecha;
                              }
                    }
          }
          
          public void imprimirMatrizG() {
                    //Nodo_Matriz_Dispersa temporalColumna = inicioColumna.derecha;
                    //Nodo_Matriz_Dispersa temporalFila = inicioFila.abajo;
                    System.out.println("********************************************************************************************************************************************************");
                    System.out.println("********************************************************************************************************************************************************");
                    System.out.println("********************************************************************************************************************************************************");

                    Nodo_Matriz_Dispersa recorrerFila = inicioFila.abajo;
                    if (recorrerFila != null) {
                              Nodo_Matriz_Dispersa tmpFil = recorrerFila;
                              //cadenaMatriz += "F_0 [label = \"\", constraint=false,   width = 1.5, color = white, group = \"MA\"];\n";
                              //cadenaMatrizPunteros += "F_0 -> F" + tmpFil.fila + "arrowhead=dot,arrowtail=normal;\n";
                              while (tmpFil != null) {
                                        //cadenaMatriz += "F" + tmpFil.fila + "[label = \"Punto 1: " + tmpFil.fila + "\", constraint=false, width = 1.5 style = filled, fillcolor = coral2, group = \"F" + tmpFil.fila + "\"];\n";
                                        cadenaMatriz += "F" + tmpFil.fila + "[label = \"Punto 1: " + tmpFil.fila + "\", constraint=false, width = 1.5 style = filled, fillcolor = coral2, group = \"MA\"];\n";
                                        ordenarFilas = "F" + tmpFil.fila + ";";
                                        if (tmpFil.abajo != null) {
                                                  cadenaMatrizPunteros += "F" + tmpFil.fila + " -> F" + tmpFil.abajo.fila + ";\n";
                                                  //cadenaMatrizPunteros += "F" + tmpFil.abajo.fila + " -> F" + tmpFil.fila + ";\n";
                                        }
                                        tmpFil = tmpFil.abajo;
                              }
                    }

                    Nodo_Matriz_Dispersa recorrerColumna = inicioColumna.derecha;
                    if (recorrerColumna != null) {
                              Nodo_Matriz_Dispersa tmpCol = recorrerColumna;
                              while (tmpCol != null) {
                                        System.out.println(tmpCol.nombre + "-----" + tmpCol.columna);
                                        cadenaMatriz += "C" + tmpCol.columna + "[label = \"Punto 2: " + tmpCol.columna + "\"  width = 1.5 style = filled, fillcolor = skyblue2, group=\"G" + tmpCol.columna + "\"];\n";
                                        ordenarColumnas += "C" + tmpCol.columna + ";";
                                        if (tmpCol.derecha != null) {
                                                  cadenaMatrizPunteros += "C" + tmpCol.columna + " -> C" + tmpCol.derecha.columna + ";\n";
                                                  //cadenaMatrizPunteros += "C" + tmpCol.derecha.columna + " -> C" + tmpCol.columna + ";\n";
                                        }
                                        //cadenaMatrizPunteros += "C" + to_string(contadorColumna + 1) + " -> C" + to_string(contadorColumna) + ";\n";
                                        //cadenaMatriz += "C" + to_string(contadorColumna) + "[label = \"" + to_string(sumadorColumna) +"\"    width = 1.5 style = filled, fillcolor = skyblue2, group=\"" + to_string(i) + "\"];\n";
                                        tmpCol = tmpCol.derecha;
                              }
                    }

                    Nodo_Matriz_Dispersa recorrerColumnaNodo = inicioColumna.derecha;
                    while (recorrerColumnaNodo != null) {
                              Nodo_Matriz_Dispersa tmpCol = recorrerColumnaNodo.abajo;
                              int coco = 0;
                              String nodoAnterior = "";
                              while (tmpCol != null) {
                                        cadenaNodosFila += "F" + tmpCol.fila + "C" + tmpCol.columna + "[label = \"Id: " + tmpCol.id + " Nombre: " + tmpCol.nombre + "\", width = 1.5, style = filled, fillcolor = gold2, group=\"G" + tmpCol.columna + "\"];\n";
                                        if (coco == 0) {
                                                  cadenaNodosFila += "C" + tmpCol.columna + "->" + "F" + tmpCol.fila + "C" + tmpCol.columna + ";\n";
                                                  //cadenaNodosFila += "F" + tmpCol.fila + "C" + tmpCol.columna + "-> C" + tmpCol.columna + ";\n";
                                                  cadenaNodosFila += "{rank = same; F" + tmpCol.fila + "; " + "F" + tmpCol.fila + "C" + tmpCol.columna + "; }\n";
                                                  nodoAnterior = "F" + tmpCol.fila + "C" + tmpCol.columna;
                                                  coco++;
                                        } else {
                                                  cadenaNodosFila += nodoAnterior + "->" + "F" + tmpCol.fila + "C" + tmpCol.columna + "[constraint = true];\n";
                                                  //cadenaNodosFila += "F" + tmpCol.fila + "C" + tmpCol.columna + "->" + nodoAnterior + "[constraint = false];\n";
                                                  //cadenaNodosFila += "F" + tmpCol.arriba.fila + "C" + tmpCol.columna + "->" + "F" + tmpCol.abajo.fila + "C" + tmpCol.columna + " [constraint = false];\n";
                                                  cadenaNodosFila += "{rank = same; F" + tmpCol.fila + "; " + "F" + tmpCol.fila + "C" + tmpCol.columna + "; }\n";
                                                  nodoAnterior = "F" + tmpCol.fila + "C" + tmpCol.columna;
                                        }

                                        tmpCol = tmpCol.abajo;
                              }
                              recorrerColumnaNodo = recorrerColumnaNodo.derecha;
                    }

                    Nodo_Matriz_Dispersa recorrerFilaNodo = inicioFila.abajo;
                    while (recorrerFilaNodo != null) {
                              Nodo_Matriz_Dispersa tmpFil = recorrerFilaNodo.derecha;
                              int coco = 0;
                              String nodoAnterior = "";
                              while (tmpFil != null) {
                                        if (coco == 0) {
                                                  cadenaNodosFila += "F" + tmpFil.fila + "->" + "F" + tmpFil.fila + "C" + tmpFil.columna + ";\n";
                                                  nodoAnterior = "F" + tmpFil.fila + "C" + tmpFil.columna;
                                                  coco++;
                                        } else {
                                                  cadenaNodosFila += nodoAnterior + "->" + "F" + tmpFil.fila + "C" + tmpFil.columna + "[constraint = true];\n";
                                                  nodoAnterior = "F" + tmpFil.fila + "C" + tmpFil.columna;
                                        }
                                        tmpFil = tmpFil.derecha;
                              }
                              recorrerFilaNodo = recorrerFilaNodo.abajo;
                    }
          }
          
          static String cadenaMatriz = "", cadenaMatrizPunteros = "", ordenarColumnas = "", ordenarFilas = "", cadenaNodosFila = "";
          
          public void GenerarDOTMatrizDispersa() {
                    try {
                              Nodo_Matriz_Dispersa verificar = inicioFila.abajo;
                              Nodo_Matriz_Dispersa verificarCol = inicioColumna.derecha;
                              FileWriter fichero = new FileWriter("MatrizDispersa.dot");
                              fichero.write("digraph Sparce_Matrix {\n"
                                      + "rankdir=TB;\n"
                                      + "node [shape=box];\n"
                                      + "edge[arrowhead=none,arrowtail=dot];"
                                      + "Mt [label = \"Matriz\" width = 1.5 style = filled, colorfilled = white, group = \"MA\"];\n"
                                      + cadenaMatriz
                                      + "{ rank = same; Mt; " + ordenarColumnas + "}\n"
                                      + cadenaMatrizPunteros
                                      + cadenaNodosFila
                                      + "Mt -> F" + verificar.fila +";\n"
                                      + "Mt -> C" + verificarCol.columna + " ;\n"
                                      //+ "{ rank = same; Mt; " + ordenarCol + "}\n"
                                      + "}");
                              fichero.close();

                              ProcessBuilder pb = new ProcessBuilder("dot", "-Tpng", "MatrizDispersa.dot", "-o", "MatrizDispersa.png");
                              Process p = pb.start();
                              p = pb.start();
                    } catch (Exception e) {
                              System.out.println("que pex");
                    }
          }
          
          public void AbrirDOTMatrizDispersa() {
                    try {
                              File objetofile = new File("MatrizDispersa.png");
                              Desktop.getDesktop().open(objetofile);
                    } catch (Exception e) {
                    }
          }
          
          public void reiniciarCadenasMatrices(){
                    cadenaMatriz = "";
                    cadenaMatrizPunteros = "";
                    ordenarColumnas = "";
                    ordenarFilas = "";
                    cadenaNodosFila = "";
          }
          
}
