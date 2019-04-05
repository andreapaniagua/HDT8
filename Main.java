//Andrea Paniagua, Diego Solorzano
//18733,
//Este es el main en el que el usuario ingresa a los pacientesx
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    private static VectorHeap<Patient> heapPrincipal = new VectorHeap<>();
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("Pacientes.txt");

        }catch (FileNotFoundException e){
            System.out.println("No se encontró el archivo");
        }catch (IOException e){

        }
        //read File here
        //patient newPatient = new Patient(nombreNuevo, condicionNueva, gravedadNueva)
        //VectorHeap.add(newPatient) esto es en el main del vector heap
        while (!heapPrincipal.isEmpty()) {
            System.out.println(heapPrincipal.remove().nombre);
        }
    }
}