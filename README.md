# Diseño Basado en Cuadrícula con GridPane (Ejercicio 7)

Este proyecto implementa el uso de `GridPane`, un contenedor avanzado que organiza los componentes en una cuadrícula flexible de filas y columnas, permitiendo un control milimétrico sobre el posicionamiento.

## 🚀 Funcionalidades
* **Distribución Tabular:** Organiza los nodos mediante un sistema de coordenadas de índices (Columna, Fila).
* **Posicionamiento Geográfico:** Replica una disposición de brújula colocando botones en posiciones estratégicas:
    * Norte (1,0), Oeste (0,1), Centro (1,1), Este (2,1) y Sur (1,2).
* **Alineación de Cuadrícula:** Centra todo el contenedor `GridPane` respecto a la ventana principal.
* **Alineación de Celdas:** Utiliza `setHalignment` para forzar que los botones "Norte" y "Sur" se centren horizontalmente dentro de sus respectivas columnas.

## 🛠️ Estructura técnica
El código demuestra el manejo de coordenadas y alineaciones complejas:
* **`grid.add(Node, col, row)`**: El método fundamental para posicionar elementos. Recuerda que en JavaFX el orden es **Columna primero, Fila después**.
* **`HPos.CENTER`**: Controla la alineación horizontal de un nodo específico dentro de las restricciones de su celda.
* **Flexibilidad Dinámica**: A diferencia de `HBox` o `VBox`, el `GridPane` permite dejar celdas vacías (como las esquinas 0,0 o 2,2 en este ejemplo) sin romper la estructura.
* **Separación Visual**: Aunque en este ejemplo no se han aplicado, `GridPane` permite configurar `hgap` y `vgap` para añadir espacio entre las celdas.