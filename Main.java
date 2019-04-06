//Andrea Paniagua, Juan Diego Solorzano
//18733, 18151
//Este es el main en el que el usuario ingresa a los pacientes
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args){

        PriorityQueue<Patient> queuePrincipal = new PriorityQueue<Patient>();
        try{
            FileReader fr = new FileReader("Pacientes.txt");
            BufferedReader br = new BufferedReader(fr);
            String text;
            int i = 0;
            while((text = br.readLine()) != null){
                String[] partes = text.split(", ");
                String nombre = partes[0];
                String descripcion = partes[1];
                String gravedad = partes[2];
                queuePrincipal.add(new Patient(nombre, descripcion, gravedad));

            }


        }catch (FileNotFoundException e){
            System.out.println("No se encontró el archivo");
        }catch (IOException e){

        }

        System.out.println("Listado de pacientes utilizando Java Collection Framework(nombre, condicion, prioridad):");
        while (!queuePrincipal.isEmpty()) {
            System.out.println(queuePrincipal.peek().nombre + ", " + queuePrincipal.peek().condicion + ", " + queuePrincipal.remove().gravedad);
        }
    }
}
