//Andrea Paniagua, Diego Solorzano
//18733,
//Este es el main en el que el usuario ingresa a los pacientesx
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainVH {
    private static VectorHeap<Patient> heapPrincipal = new VectorHeap<>();
    public static void main(String[] args){
        PriorityQueue<Patient> preQueue = new PriorityQueue<>();
        try{
            FileReader fr = new FileReader("Pacientes.txt");

        }catch (FileNotFoundException e){
            System.out.println("No se encontró el archivo");
        }catch (IOException e){

        }
        //VectorHeap.add(newPatient) esto es en el main del vector heap
        while (!heapPrincipal.isEmpty()) {
            System.out.println(heapPrincipal.remove().nombre);
        }
    }
}