/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas;

/**
 *
 * @author Efrain Soza
 */
public class Main {

    public static void main(String[] args) {
//Declaramos y creamos un objeto pila de mi clase Pilas
        Pilas pila = new Pilas();
//Imprimimos en pantalla
        System.out.println("<<-- Ejemplo de Pila -->>\n\n");
//Le asignamos los valores que vamos a apilar y el orden 
        pila.apilar(4);
        pila.apilar(16);
        pila.apilar(12);
        pila.apilar(8);
        pila.apilar(65);

//Mostramos en pantalla la pila de valores que ingresamos
        System.out.println("<<-- Pila -->>");
        pila.listar();
//Mostamos el tamanio que tiene la pila 
        System.out.println("\n<<-- Tamaño -->");
        System.out.println(pila.getTamanio());
//Retiramos el ultimo elemento ingresado en la pila
        System.out.println("\n<<-- Retirar el elemento del tope de la pila -->>");
        pila.retirar();

//Luego de retirar el ultimo elemento volvemos a mostrar la pila sin el elemento
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

//Modificamos un valor por otro en los valores de la pila
        System.out.println("\n<<-- Actualizar el valor del nodo con el valor 12 por 24 -->>");
        pila.editar(12, 44);

//Luego de modificar, volemos a mostrar la pila 
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

//Eliminamos un valor especifico en la pila
        System.out.println("\n<<-- Eliminar el nodo con el valor 16 -->>");
        pila.remover(16);

//Luego de eliminar el dato, volvemos a mostrar la pila
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamanio());

//Indicar Verdadero o falso al preguntar si la pila cuenta con un dato especifico
        System.out.println("\n<<-- Consulta si existe el valor 10 -->>");
        System.out.println(pila.buscar(10));

//Eliminar la pila completamente
        System.out.println("\n<<-- Elimina la pila -->>");
        pila.eliminar();

//Indicar verdadero o falso luego de eliminar la pila cuando pregunten si esta vacia
        System.out.println("\n<<-- Consulta si la pila esta vacia -->>");
        System.out.println(pila.esVacia());

//imprimir en pantalla el fin del ejemplo
        System.out.println("\n\n<<-- Fin de ejemplo pila -->>");
    }
}
