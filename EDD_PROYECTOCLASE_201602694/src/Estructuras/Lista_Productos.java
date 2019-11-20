/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javier
 */
public class Lista_Productos {
          
          private Nodo_Producto inicio;
          private Nodo_Producto fin;
          private ArrayList<Object[]> datosTabla = new ArrayList<Object[]>();
          
          public Lista_Productos() {
                    inicio = null;
                    fin = null;
          }
          
          public void agregarALista(int id_Producto, String nombre, String marca, int cantidad, int precio, String tipo, boolean disponible) {
                    Nodo_Producto nuevo_nodo = new Nodo_Producto(id_Producto, nombre, marca, cantidad, precio, tipo, disponible);
                    Nodo_Producto auxiliar = inicio;
                    if (inicio == null) {
                              inicio = nuevo_nodo;
                              inicio.siguiente = null;
                              inicio.anterior = null;
                    } else {
                              while (auxiliar != null && auxiliar.siguiente != null && auxiliar.id_Producto <= id_Producto) {
                                        auxiliar = auxiliar.siguiente;
                              }
                              if (auxiliar.id_Producto < id_Producto) {
                                        if (auxiliar.siguiente == null) {
                                                  auxiliar.siguiente = nuevo_nodo;
                                                  nuevo_nodo.anterior = auxiliar;
                                        } else {
                                                  Nodo_Producto temporal = auxiliar.siguiente;
                                                  nuevo_nodo.siguiente = auxiliar.siguiente;
                                                  nuevo_nodo.anterior = auxiliar.anterior;
                                                  auxiliar.siguiente = nuevo_nodo;
                                                  temporal.anterior = nuevo_nodo;
                                        }
                              } else if (auxiliar.id_Producto > id_Producto) {
                                        if (auxiliar.anterior == null) {
                                                  auxiliar.anterior = nuevo_nodo;
                                                  nuevo_nodo.siguiente = auxiliar;
                                                  auxiliar = inicio;
                                                  inicio = nuevo_nodo;
                                        } else {
                                                  Nodo_Producto temporal = new Nodo_Producto();
                                                  temporal.siguiente = auxiliar;
                                                  temporal.anterior = auxiliar.anterior;
                                                  auxiliar.anterior.siguiente = nuevo_nodo;
                                                  auxiliar.anterior = nuevo_nodo;
                                                  nuevo_nodo.anterior = temporal.anterior;
                                                  nuevo_nodo.siguiente = temporal.siguiente;
                                        }
                              } else {
                                        nuevo_nodo = auxiliar;
                              }
                    }
          }
          
          public void ModificarListaProductos(int NodoBuscado/*id_Producto*/, String nombre, String marca, int cantidad, int precio, String tipo, boolean disponible) {
                    Nodo_Producto actual = new Nodo_Producto();
                    actual = inicio;
                    boolean encontrado = false;
                    if (inicio == null) {
                              System.out.println("Lista Vacia");
                    } else {
                              while (actual != null && encontrado != true) {
                                        if (actual.id_Producto == NodoBuscado) {
                                                  System.out.println("El ID (" + NodoBuscado + ") ha sido encontrado");
                                                  actual.id_Producto = NodoBuscado;
                                                  actual.nombre = nombre;
                                                  actual.marca = marca;
                                                  actual.cantidad = cantidad;
                                                  actual.precio = precio;
                                                  actual.tipo = tipo;
                                                  actual.disponible = disponible;
                                                  encontrado = true;
                                                  break;
                                        }
                                        actual = actual.siguiente;
                              }
                              if (encontrado == false) {
                                        System.out.println("El ID (" + NodoBuscado + ") no se encontro");
                              }
                    }
          }
          
          public void EliminarListaProductos(int NodoBuscado/*id_Producto*/) {
                    Nodo_Producto actual = new Nodo_Producto();
                    actual = inicio;
                    boolean encontrado = false;
                    if (inicio == null) {
                              System.out.println("Lista Vacia");
                    } else {
                              while (actual != null && encontrado != true) {
                                        if (actual.id_Producto == NodoBuscado) {
                                                  System.out.println("El ID (" + NodoBuscado + ") ha sido encontrado");
                                                  actual.anterior.siguiente = actual.siguiente;
                                                  actual.siguiente.anterior = actual.anterior;
                                                  actual = null;
                                                  encontrado = true;
                                                  break;
                                        }
                                        actual = actual.siguiente;
                              }
                              if (encontrado == false) {
                                        System.out.println("El ID (" + NodoBuscado + ") no se encontro");
                              }
                    }
          }
          
          public int CuantoHay() {
                    Nodo_Producto actual = new Nodo_Producto();
                    int contador = 0;
                    actual = inicio;
                    if (inicio == null) {
                              contador = 0;
                    } else {
                              while (actual != null) {
                                        contador++;
                                        actual = actual.siguiente;
                              }
                    }
                    return contador;
          }

          public void ImprimirListaDoble() {
                    Nodo_Producto actual = new Nodo_Producto();
                    actual = inicio;
                    if (inicio == null) {
                              System.out.println("Lista Vacia");
                    } else {
                              while (actual != null) {
                                        System.out.print(actual.id_Producto + "   <->    ");
                                        actual = actual.siguiente;
                              }
                    }
          }
          
          public void AgregarAModeloTabla(DefaultTableModel modelo) {
                    int lineas = modelo.getRowCount() - 1;
                    for (int i = lineas; i >= 0; i--) {
                              modelo.removeRow(i);
                    }
                    Nodo_Producto actual = new Nodo_Producto();
                    actual = inicio;
                    if (inicio == null) {
                              System.out.println("Lista Vacia");
                    } else {
                              while (actual != null) {
                                        Object[] info = new Object[]{actual.id_Producto, actual.nombre, actual.marca, actual.cantidad, actual.precio, actual.tipo, actual.disponible};
                                        datosTabla.add(info);
                                        modelo.addRow(info);
                                        actual = actual.siguiente;
                              }
                    }
          }

          public String BuscarProducto(int NodoBuscado) {
                    String retorno = "";
                    Nodo_Producto actual = new Nodo_Producto();
                    actual = inicio;
                    boolean encontrado = false;
                    if (inicio == null) {
                              System.out.println("Lista Vacia");
                    } else {
                              while (actual != null && encontrado != true) {
                                        if (actual.id_Producto == NodoBuscado) {
                                                  System.out.println("El ID (" + NodoBuscado + ") ha sido encontrado");
                                                  retorno = Integer.toString(actual.id_Producto) + "," + actual.nombre + "," + actual.precio;
                                                  encontrado = true;
                                                  break;
                                        }
                                        actual = actual.siguiente;
                              }
                              if (encontrado == false) {
                                        System.out.println("El ID (" + NodoBuscado + ") no se encontro");
                              }
                    }

                    return retorno;
          }
          
}
