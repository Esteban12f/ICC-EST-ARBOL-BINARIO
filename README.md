### Clase `InsertBTSTest`

#### **Propósito:
Esta clase se utiliza para construir un Árbol Binario de Búsqueda (BST) en el que los valores se organizan de manera que los nodos a la izquierda de un nodo contienen valores menores, y los nodos a la derecha contienen valores mayores o iguales. Este orden facilita operaciones como búsqueda y recorrido en orden.

#### Funcionamiento:
- La clase tiene un atributo `root` que representa la raíz del árbol.
- Ofrece métodos para insertar nuevos valores, asegurando que se respeten las propiedades del BST.
- También incluye un método para obtener la raíz del árbol, permitiendo que otras clases interactúen con él.

#### Aplicación:
Esta clase es el punto de partida para trabajar con árboles en los ejercicios. El árbol construido aquí se utiliza como base para los ejercicios de inversión, listado de niveles y cálculo de profundidad.


### Clase `InvertBinaryTree`

#### Propósito:
Permite transformar el árbol binario invirtiendo las conexiones entre los subárboles izquierdo y derecho en cada nodo. Esto es útil para estudiar cómo cambian las estructuras del árbol y probar la flexibilidad de los algoritmos de manipulación.

#### Funcionamiento:
- El método de inversión recorre el árbol de manera recursiva.
- En cada nodo, intercambia el subárbol izquierdo con el derecho.
- Este proceso se repite hasta que se hayan invertido todas las conexiones, produciendo una versión completamente reflejada del árbol original.

#### Aplicación:
Es particularmente útil en problemas donde se necesita evaluar la simetría o explorar cómo cambian los recorridos y las estructuras en árboles invertidos.

### Clase `ListLevels`

#### Propósito:
Permite listar los nodos del árbol nivel por nivel, organizándolos en una estructura jerárquica. Esto se conoce como un recorrido por niveles (BFS) y es una técnica fundamental para analizar árboles.

#### Funcionamiento:
- Se utiliza una cola para gestionar los nodos pendientes de visitar.
- Los nodos de cada nivel se agrupan en una sublista, y estas sublistas se almacenan en una lista principal.
- Al finalizar, se obtiene una representación clara de cómo están organizados los nodos en cada nivel.

#### Aplicación:
Ideal para problemas donde se necesita imprimir o visualizar el árbol por niveles, identificar patrones en la estructura del árbol o realizar análisis en cada nivel de manera separada.

### Clase `Depth`

#### Propósito:
Su objetivo es calcular la profundidad máxima del árbol binario, que corresponde al número de niveles desde la raíz hasta la hoja más profunda. Este cálculo es fundamental para evaluar el tamaño y la complejidad del árbol.

#### Funcionamiento:
- La profundidad se calcula de forma recursiva.
- Para cada nodo, se determina la mayor profundidad entre su subárbol izquierdo y derecho, sumando 1 por el nivel actual.
- Si un nodo no tiene hijos (es una hoja), la profundidad en ese punto es cero.

#### Aplicación:
Se usa para medir la altura del árbol, lo cual es clave en aplicaciones como optimización de estructuras de datos, diseño de algoritmos de búsqueda y evaluación de eficiencia.

### Relación entre las clases

1. Construcción del árbol: La clase `InsertBTSTest` permite crear el árbol binario inicial, con nodos organizados de acuerdo con las reglas de un BST.
2. Manipulación del árbol: La clase `InvertBinaryTree` toma el árbol creado y lo invierte, modificando su estructura de manera completa.
3. Visualización y análisis: La clase `ListLevels` organiza y presenta los nodos del árbol en un formato claro, nivel por nivel, facilitando su análisis y comprensión.
4. Evaluación de propiedades: La clase `Depth` proporciona información clave sobre la estructura del árbol al calcular su profundidad máxima, lo que es útil para medir su tamaño y complejidad.

En conjunto, estas clases forman un sistema modular que permite construir, manipular, analizar y comprender árboles binarios desde diferentes perspectivas, siendo útiles en diversas aplicaciones como algoritmos de búsqueda, diseño de bases de datos y simulación de estructuras jerárquicas.
