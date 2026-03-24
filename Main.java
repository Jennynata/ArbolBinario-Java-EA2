import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        Scanner leer = new Scanner(System.in);
        int opcion, valor;

        do {
            System.out.println("\n--- SIMULADOR DE ÁRBOL BINARIO ---");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido Inorden");
            System.out.println("3. Buscar un número");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el número a insertar: ");
                    valor = leer.nextInt();
                    arbol.insertar(valor);
                    System.out.println("Número insertado.");
                }
                case 2 -> arbol.mostrarInorden();
                case 3 -> {
                    System.out.print("Ingrese el número a buscar: ");
                    valor = leer.nextInt();
                    if (arbol.buscar(valor)) {
                        System.out.println("¡El número " + valor + " existe en el árbol!");
                    } else {
                        System.out.println("El número " + valor + " NO se encuentra.");
                    }
                }
                case 4 -> System.out.println("Saliendo del simulador...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
        
        leer.close();
    }
}