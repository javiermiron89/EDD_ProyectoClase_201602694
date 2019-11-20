/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Interfaz.Facturas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javier
 */
public class Lista_Doble_Cliente {

          private Nodo_Cliente inicio;
          private Nodo_Cliente fin;
          private ArrayList<Object[]> datosTabla = new ArrayList<Object[]>();

          public Lista_Doble_Cliente() {
                    inicio = null;
                    fin = null;
          }
          
          public void agregarAListaDoble(int nit, String nombre, String apellido, String direccion, int telefono, String fecha_nacimiento) {
                    Nodo_Cliente nuevo_nodo = new Nodo_Cliente(nit, nombre, apellido, direccion, telefono, fecha_nacimiento);
                    Nodo_Cliente auxiliar = inicio;
                    if (inicio == null) {
                              inicio = nuevo_nodo;
                              inicio.siguiente = null;
                              inicio.anterior = null;
                    } else {
                              while (auxiliar != null && auxiliar.siguiente != null && auxiliar.nit <= nit) {
                                        auxiliar = auxiliar.siguiente;
                              }
                              if (auxiliar.nit < nit) {
                                        if (auxiliar.siguiente == null) {
                                                  auxiliar.siguiente = nuevo_nodo;
                                                  nuevo_nodo.anterior = auxiliar;
                                        } else {
                                                  Nodo_Cliente temporal = auxiliar.siguiente;
                                                  nuevo_nodo.siguiente = auxiliar.siguiente;
                                                  nuevo_nodo.anterior = auxiliar.anterior;
                                                  auxiliar.siguiente = nuevo_nodo;
                                                  temporal.anterior = nuevo_nodo;
                                        }
                              } else if (auxiliar.nit > nit) {
                                        if (auxiliar.anterior == null) {
                                                  auxiliar.anterior = nuevo_nodo;
                                                  nuevo_nodo.siguiente = auxiliar;
                                                  auxiliar = inicio;
                                                  inicio = nuevo_nodo;
                                        } else {
                                                  Nodo_Cliente temporal = new Nodo_Cliente();
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
          
          public void ModificarListaDoble(int NodoBuscado/*NIT*/, String nombre, String apellido, String direccion, int telefono, String fecha_nacimiento) {
                    Nodo_Cliente actual = new Nodo_Cliente();
                    actual = inicio;
                    boolean encontrado = false;
                    if (inicio == null) {
                              System.out.println("Lista Vacia");
                    } else {
                              while (actual != null && encontrado != true) {
                                        if (actual.nit == NodoBuscado) {
                                                  System.out.println("El NIT (" + NodoBuscado + ") ha sido encontrado");
                                                  actual.nit = NodoBuscado;
                                                  actual.nombre = nombre;
                                                  actual.apellido = apellido;
                                                  actual.direccion = direccion;
                                                  actual.telefono = telefono;
                                                  actual.fecha_nacimiento = fecha_nacimiento;
                                                  encontrado = true;
                                        }
                                        actual = actual.siguiente;
                              }
                              if (encontrado == false) {
                                        System.out.println("El NIT (" + NodoBuscado + ") no se encontro");
                              }
                    }
          }
          
          public void EliminarListaDoble(int NodoBuscado/*NIT*/) {
                    Nodo_Cliente actual = new Nodo_Cliente();
                    actual = inicio;
                    boolean encontrado = false;
                    if (inicio == null) {
                              System.out.println("Lista Vacia");
                    } else {
                              while (actual != null && encontrado != true) {
                                        if (actual.nit == NodoBuscado) {
                                                  System.out.println("El NIT (" + NodoBuscado + ") ha sido encontrado");
                                                  actual.anterior.siguiente = actual.siguiente;
                                                  actual.siguiente.anterior = actual.anterior;
                                                  actual = null;
                                                  encontrado = true;
                                                  break;
                                        }
                                        actual = actual.siguiente;
                              }
                              if (encontrado == false) {
                                        System.out.println("El NIT (" + NodoBuscado + ") no se encontro");
                              }
                    }
          }
          
          public int CuantoHay() {
                    Nodo_Cliente actual = new Nodo_Cliente();
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
                    Nodo_Cliente actual = new Nodo_Cliente();
                    actual = inicio;
                    if (inicio == null) {
                              System.out.println("Lista Vacia");
                    } else {
                              while (actual != null) {
                                        System.out.print(actual.nit + "       ");
                                        actual = actual.siguiente;
                              }
                    }
          }
          
          public void AgregarAModeloTabla(DefaultTableModel modelo) {
                    int lineas = modelo.getRowCount() - 1;
                    for (int i = lineas; i >= 0; i--) {
                              modelo.removeRow(i);
                    }
                    Nodo_Cliente actual = new Nodo_Cliente();
                    actual = inicio;
                    if (inicio == null) {
                              System.out.println("Lista Vacia");
                    } else {
                              while (actual != null) {
                                        Object[] info = new Object[]{actual.nit, actual.nombre, actual.apellido, actual.direccion, actual.telefono, actual.fecha_nacimiento};
                                        datosTabla.add(info);
                                        modelo.addRow(info);
                                        actual = actual.siguiente;
                              }
                    }
          }

          public void RetornarClientes(Facturas facturas) {
                    facturas.Cbx_Nit.removeAllItems();
                    Nodo_Cliente actual = new Nodo_Cliente();
                    actual = inicio;
                    if (inicio == null) {
                              System.out.println("Lista NITS vacia");
                              JOptionPane.showMessageDialog(null, "NO SE ENCONTRO NINGUN CLIENTE REGISTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                              while (actual != null) {
                                        //System.out.print(actual.nit + "       ");
                                        facturas.Cbx_Nit.addItem(Integer.toString(actual.nit));
                                        actual = actual.siguiente;
                              }
                    }
          }
          
          public String RetornarNombreCliente(String nit) {
                    String retorno = "";
                    Nodo_Cliente actual = new Nodo_Cliente();
                    actual = inicio;
                    boolean encontrado = false;
                    if (inicio == null) {
                              System.out.println("Lista Vacia");
                    } else {
                              while (actual != null && encontrado != true) {
                                        if (actual.nit == Integer.parseInt(nit)) {
                                                  retorno = actual.nombre + " " + actual.apellido;
                                                  break;
                                        }
                                        actual = actual.siguiente;
                              }
                              if (encontrado == false) {
                                        
                              }
                    }
                    return retorno;
          }
}
