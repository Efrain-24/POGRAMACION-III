/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

/**
 *
 * @author Efrain Soza
 */
public class Main {

    public static void main(String[] args) {
//Declaramos y creamos un objeto cola de mi clase Pilas 
        Colas cola = new Colas();
//Le asignamos los valores que vamos a encolar y el orden 
        cola.insertar(46);
        cola.insertar(12);
        cola.insertar(87);
        cola.insertar(125);
        cola.insertar(30);

//Mostramos en pantalla el tamanio que tiene la cola
        
System.out.println("<<-- Tamanio -->>");
        cola.contar();

//Mostramos en pantalla la cola de valores que ingresamos
        System.out.println("Cola: " + cola.toString());

//Eliminamos el primer dato que se ingreso a la cola
        System.out.println("\n<<-- Retirar el primer elemento de la Cola -->>" + "\n");
        cola.extraer();

//Mostramos en pantalla el tamanio que tiene la cola
        System.out.println("<<-- Tamanio -->>");
        cola.contar();

//Mostramos en pantalla la cola de valores que quedan
        System.out.println("Cola: " + cola.toString() + "\n");

//Indica si la cola esta o no vacia 
        cola.estaVacia();
        System.out.println();

//Mostramos en pantalla el tamanio que tiene la cola
        System.out.println("<<-- Tamanio -->>");
        cola.contar();

//Mostramos en pantalla la cola de valores que quedan
        System.out.println("Cola: " + cola.toString());
    }
}
