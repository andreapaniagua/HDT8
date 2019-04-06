
//Andrea Paniagua, Diego Solorzano
//18733,
//test de vectorheap
import org.junit.Assert;
import org.junit.Test;
public class VectorHeapTest {

    @org.junit.Test
    public void parent() {
    }

    @org.junit.Test
    public void left() {
    }

    @org.junit.Test
    public void right() {
    }

    @org.junit.Test
    public void percolateUp() {
    }

    @org.junit.Test
    public void add() {
        VectorHeap<Patient> testVecHeap=new VectorHeap<>();
        Assert.assertEquals(testVecHeap.size(), 0);
    }

    @org.junit.Test
    public void isEmpty() {
    }

    @org.junit.Test
    public void size() {
        VectorHeap<Patient> testVecHeap = new VectorHeap<>();
        Assert.assertEquals(testVecHeap.size(), 0);
    }

    @org.junit.Test
    public void clear() {
        VectorHeap<Patient> testVecHeap = new VectorHeap<>();
        testVecHeap.add(new Patient("prueba1", "brazo roto", "B"));
        testVecHeap.add(new Patient("prueba2", "gripe", "A"));
        Assert.assertEquals(testVecHeap.size(), 2);
    }

    @org.junit.Test
    public void pushDownRoot() {
    }

    @org.junit.Test
    public void getFirst() {
    }

    @org.junit.Test
    public void remove() {
        VectorHeap<Patient> testVecHeap = new VectorHeap<>();
        testVecHeap.add(new Patient("prueba1", "gripe", "C"));
        testVecHeap.add(new Patient("prueba2", "dolor de cabeza", "E"));
        Assert.assertEquals(testVecHeap.getFirst().nombre, "prueba1");
        testVecHeap.remove();
    }
}