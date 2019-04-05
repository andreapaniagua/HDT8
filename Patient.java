public class Patient implements Comparable {

    String nombre;
    String condicion;
    String gravedad;

    public Patient(String nombre, String condicion, String gravedad){
        this.nombre = nombre;
        this.condicion = condicion;
        this.gravedad = gravedad;
    }

    @Override
    public int compareTo(Object o) {
        return this.gravedad.compareTo(((Patient) o).gravedad);
    }
}