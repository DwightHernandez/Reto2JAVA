# Reto 2 JAVA
Con este reto se queria poner a prueba los conocimientos en JAVA, mas... La verdad no se como lo hice, pero lo hice, y me siento orgulloso de ello.
(pov: me compila pero no me muestra nada, y no se porque... pero compila)

### Ejercicio 1

1. Se requiere un sistema para una biblioteca. Se deben modelar las clases necesarias para gestionar los diferentes tipos de recursos que tiene la biblioteca, como libros y revistas. Se debe aplicar los conceptos de programación orientada a objetos en este escenario.
Define una clase Recurso que debe tener los siguientes atributos privados:
-id (int): identificador único del recurso.
- titulo (String): título del recurso.
- disponible (boolean): indica si el recurso está disponible para préstamo.
La clase debe tener un constructor para inicializar estos atributos y los métodos públicos para acceder a ellos. Define las clases Libro y Revista:
- Ambas clases deben heredar de la clase Recurso.
- La clase Libro debe tener un atributo adicional: autor (String): autor del libro.
- La clase Revista debe tener un atributo adicional: numero (int): número de la revista. - La clase Revista debe tener un atributo adicional: tipo (tipoRevista): define el tipo de revista (mínimo 5) y deben ser definidos por un enumerado.
- Cada clase debe tener su propio constructor para inicializar sus atributos y sobrescribir el método toString() para proporcionar una representación de cadena adecuada del objeto.

Define una clase Biblioteca:
- La clase Biblioteca debe tener una lista de recursos disponibles y un método para agregar un recurso a la biblioteca.
- Debe tener un método llamado prestarRecurso(int id) que cambie el estado de
disponibilidad del recurso con el ID proporcionado.
- Implementa un método buscar RecursoPorTitulo(String titulo) que devuelva una lista de recursos (puede ser tanto libros como revistas) con un título específico.
- Todos los métodos de Biblioteca son definidos por una interfaz.
Prueba del Sistema:
- Crea instancias de varios libros y revistas.
- Agrega estos recursos a una instancia de la clase Biblioteca.
- Realiza algunas operaciones de préstamo y búsqueda para demostrar el funcionamiento del sistema.

#### Instrucciones:
- Implementa las clases Recurso, Libro, Revista y Biblioteca según las especificaciones dadas.
- Utiliza los conceptos de herencia, polimorfismo, encapsulamiento y abstracción en tu implementación.
-Proporciona un ejemplo de uso del sistema en un método main() para demostrar el funcionamiento de las clases.
- Asegúrate que el código esté organizado y documentado y que no viole ningún patrón de diseño SOLID.



- El ejercicio se encuentra en el paquete `Reto2.BibliotecaKevinnHernandez`

---

### Ejercicio 2

- No lo hice :,(