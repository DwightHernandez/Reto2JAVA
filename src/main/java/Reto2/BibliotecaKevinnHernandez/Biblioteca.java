package Reto2.BibliotecaKevinnHernandez;

public class Biblioteca {
    private Recurso[] recursos;

    public Biblioteca(Recurso[] recursos) {
        this.recursos = recursos;
    }

    public Recurso[] getRecursos() {
        return recursos;
    }

    public void setRecursos(Recurso[] recursos) {
        this.recursos = recursos;
    }

    public void agregarRecurso(Recurso recurso) {
        Recurso[] recursosTemp = new Recurso[recursos.length + 1];
        System.arraycopy(recursos, 0, recursosTemp, 0, recursos.length);
        recursosTemp[recursosTemp.length - 1] = recurso;
        recursos = recursosTemp;
    }

    public void prestarRecurso(int id) {
        for (Recurso recurso : recursos) {
            if (recurso.getId() == id) {
                recurso.setDisponible(false);
            }
        }
    }

    public Recurso[] buscarRecursoPorTitulo(String titulo) {
        Recurso[] recursosTemp = new Recurso[0];
        for (Recurso recurso : recursos) {
            if (recurso.getTitulo().equals(titulo)) {
                Recurso[] recursosTemp2 = new Recurso[recursosTemp.length + 1];
                System.arraycopy(recursosTemp, 0, recursosTemp2, 0, recursosTemp.length);
                recursosTemp2[recursosTemp2.length - 1] = recurso;
                recursosTemp = recursosTemp2;
            }
        }
        return recursosTemp;
    }

    @Override
    public String toString() {
        StringBuilder recursosString = new StringBuilder();
        for (Recurso recurso : recursos) {
            recursosString.append(recurso.toString()).append("\n");
        }
        return recursosString.toString();
    }

    public void agregarRecurso(Revista revista1) {
    }

    public void agregarRecurso(Libro libro3) {
    }
}
