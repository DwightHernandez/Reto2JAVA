package Reto2.BibliotecaKevinnHernandez;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = getBiblioteca();
        System.out.println(biblioteca);
        biblioteca.prestarRecurso(1);
        biblioteca.prestarRecurso(2);
        biblioteca.prestarRecurso(3);
        biblioteca.prestarRecurso(4);
        biblioteca.prestarRecurso(5);
        biblioteca.prestarRecurso(6);
        System.out.println(biblioteca);
        Recurso[] recursosEncontrados = biblioteca.buscarRecursoPorTitulo("Muy interesante");
        for (Recurso recursosEncontrado : recursosEncontrados) {
            System.out.println(recursosEncontrado.toString());
        }
    }


    private static Biblioteca getBiblioteca() {
        Recurso[] recursos = new Recurso[0];
        Biblioteca biblioteca = new Biblioteca(recursos);
        Libro libro1 = new Libro(1, "El señor de los anillos", true, "J.R.R. Tolkien", 1000);
        Libro libro2 = new Libro(2, "El hobbit", true, "J.R.R. Tolkien", 500);
        Libro libro3 = new Libro(3, "El silmarillion", true, "J.R.R. Tolkien", 800);
        Revista revista1 = new Revista(4, "Muy interesante", true, 1, Revista.TipoRevista.CIENTIFICA);
        Revista revista2 = new Revista(5, "Muy interesante", true, 2, Revista.TipoRevista.CIENTIFICA);
        Revista revista3 = new Revista(6, "Muy interesante", true, 3, Revista.TipoRevista.CIENTIFICA);
        biblioteca.agregarRecurso(libro1);
        biblioteca.agregarRecurso(libro2);
        biblioteca.agregarRecurso(libro3);
        biblioteca.agregarRecurso(revista1);
        biblioteca.agregarRecurso(revista2);
        biblioteca.agregarRecurso(revista3);
        return biblioteca;

    }
// Recurso[] recursos = new Recurso[0];
// Biblioteca biblioteca = new Biblioteca(recursos);
// Libro libro1 = new Libro(1, "El señor de los anillos", true, "J.R.R. Tolkien", 1000);
// Libro libro2 = new Libro(2, "El hobbit", true, "J.R.R. Tolkien", 500);
// Libro libro3 = new Libro(3, "El silmarillion", true, "J.R.R. Tolkien", 800);
// Revista revista1 = new Revista(4, "Muy interesante", true, 1, Revista.TipoRevista.CIENTIFICA);
// Revista revista2 = new Revista(5, "Muy interesante", true, 2, Revista.TipoRevista.CIENTIFICA);
// Revista revista3 = new Revista(6, "Muy interesante", true, 3, Revista.TipoRevista.CIENTIFICA);
// biblioteca.agregarRecurso(libro1);
// biblioteca.agregarRecurso(libro2);
// biblioteca.agregarRecurso(libro3);
// biblioteca.agregarRecurso(revista1);
// biblioteca.agregarRecurso(revista2);
// biblioteca.agregarRecurso(revista3);
// System.out.println(biblioteca.toString());
// biblioteca.prestarRecurso(1);
// biblioteca.prestarRecurso(2);
// biblioteca.prestarRecurso(3);
// biblioteca.prestarRecurso(4);
// biblioteca.prestarRecurso(5);
// biblioteca.prestarRecurso(6);
// System.out.println(biblioteca.toString());
// Recurso[] recursosEncontrados = biblioteca.buscarRecursoPorTitulo("Muy interesante");
// for (int i = 0; i < recursosEncontrados.length; i++) {
//     System.out.println(recursosEncontrados[i].toString());
// }
// System.out.println(biblioteca.toString());


}
