package Reto2.BibliotecaKevinnHernandez;


import java.util.Scanner;

public class Recurso {
    Scanner entrada = new Scanner(System.in);
    private int id;
    private String titulo;
    private boolean disponible;

    public Recurso(int id, String titulo, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        String estado = "";
        if (disponible) {
            estado = "Disponible";
        } else {
            estado = "No disponible";
        }
        return "Recurso{" + "id=" + id + ", titulo=" + titulo + ", disponible=" + estado + '}';
    }

}
