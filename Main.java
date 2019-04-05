public class Main {
    private static VectorHeap<Patient> heapPrincipal = new VectorHeap<>();
    public static void main(String[] args){
        //read File here
        //patient newPatient = new Patient(nombreNuevo, condicionNueva, gravedadNueva)
        //VectorHeap.add(newPatient)
        while (!heapPrincipal.isEmpty()) {
            System.out.println(heapPrincipal.remove().nombre);
        }
    }
}