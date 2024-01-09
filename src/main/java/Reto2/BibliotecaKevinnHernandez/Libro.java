package Reto2.BibliotecaKevinnHernandez;

public class Libro {
    private int id;
    private String titulo;
    private boolean disponible;
    private String autor;
    private int numeroPaginas;

    public Libro(int id, String titulo, boolean disponible, String autor, int numeroPaginas) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        String estado = "";
        if (disponible) {
            estado = "Disponible";
        } else {
            estado = "No disponible";
        }
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", disponible=" + estado + ", autor=" + autor
                + ", numeroPaginas=" + numeroPaginas + '}';
    }
}
