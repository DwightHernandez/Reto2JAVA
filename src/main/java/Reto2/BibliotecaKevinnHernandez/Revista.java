package Reto2.BibliotecaKevinnHernandez;

public class Revista {
    private int id;
    private String titulo;
    private boolean disponible;
    private int numero;
    private TipoRevista tipo;

    public Revista(int id, String titulo, boolean disponible, int numero, TipoRevista tipo) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
        this.numero = numero;
        this.tipo = tipo;
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

    public int getNumero() {
        return numero;
    }

    public TipoRevista getTipo() {
        return tipo;
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

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(TipoRevista tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String estado = "";
        if (disponible) {
            estado = "Disponible";
        } else {
            estado = "No disponible";
        }
        return "Revista{" + "id=" + id + ", titulo=" + titulo + ", disponible=" + estado + ", numero=" + numero
                + ", tipo=" + tipo + '}';
    }

    public enum TipoRevista {
        CIENTIFICA, DIVULGATIVA, TEMATICA, LITERARIA, INFORMATIVA
    }
}
