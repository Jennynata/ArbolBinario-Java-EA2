📖 Simulador de Árbol Binario en Java
Este proyecto es una implementación práctica de una estructura de datos de tipo Árbol Binario de Búsqueda. Ha sido desarrollado como actividad académica para la IUDigital de Antioquia.

👥 Integrantes
Alejandro Echavarria Jaramillo - C.C 1017175353

Natalia castrillon - C.C 1037369541

🌳 ¿Qué es un Árbol Binario?
Imagina un árbol genealógico, pero con reglas muy estrictas. Un Árbol Binario es una estructura de datos donde cada "nodo" (punto de información) puede tener, como máximo, dos hijos: uno a la izquierda y otro a la derecha.

En nuestra implementación (Árbol Binario de Búsqueda):

Si el número que insertamos es menor que el nodo actual, se va para la izquierda.

Si el número es mayor, se va para la derecha.
Esto hace que buscar información sea increíblemente rápido, ¡como buscar una palabra en un diccionario!

🛠️ Cómo se implementó
El proyecto se divide en tres partes fundamentales:

Clase Nodo.java: Es la unidad básica. Guarda el valor numérico y tiene dos "flechas" (punteros) hacia sus hijos izquierdo y derecho.

Clase ArbolBinario.java: Contiene toda la lógica.

Inserción: Ubica los números en su lugar correcto siguiendo las reglas de "menor a la izquierda, mayor a la derecha".

Recorrido Inorden: Es una forma de visitar los nodos que tiene una propiedad mágica: ¡siempre nos muestra los números en orden de menor a mayor!

Búsqueda: Explora el árbol eficientemente para decirnos si un número ya existe o no.

Clase Main.java: Es la interfaz de usuario. Creamos un menú interactivo usando un ciclo do-while y un switch para que el usuario pueda interactuar con el árbol desde la consola.

🚀 Ejemplo de Ejecución

1. Menú Principal
Al iniciar el programa, verás un menú como este:
![Captura 1](./Screenshot%2026-03-23%215656.png)

2. Insertar y Mostrar Inorden
Si insertamos los números 50, 30 y 70, al elegir la opción "Mostrar Inorden", el sistema los organizará automáticamente:
Resultado: 30, 50, 70
![Captura 2](./Screenshot%2026-03-23%215753.png)

3. Búsqueda de Datos
El sistema permite verificar la existencia de un valor:
![Captura 3](./Screenshot%2026-03-23%215840.png)

⚙️ Requisitos
Java JDK 8 o superior.

Un IDE (IntelliJ, Eclipse, NetBeans) o simplemente la terminal de comandos.
