//Andrea Paniagua, Juan Diego Solorzano
//18733, 18151
//Este es el main en el que el usuario ingresa a los pacientes
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainVH {
    private static VectorHeap<Patient> heapPrincipal = new VectorHeap<>();

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Pacientes.txt");
            BufferedReader br = new BufferedReader(fr);
            String text;
            int i = 0;
            while ((text = br.readLine()) != null) {
                String[] partes = text.split(", ");
                String nombre = partes[0];
                String descripcion = partes[1];
                String gravedad = partes[2];
                heapPrincipal.add(new Patient(nombre, descripcion, gravedad));

            }


        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {

        }

        System.out.println("Listado de pacientes (nombre, condicion, prioridad):");
        while (!heapPrincipal.isEmpty()) {
            System.out.println(heapPrincipal.getFirst().nombre + ", " + heapPrincipal.getFirst().condicion + ", " + heapPrincipal.remove().gravedad);
        }

    }
}
