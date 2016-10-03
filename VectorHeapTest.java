import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class VectorHeapTest {

	@Before
	public void setUp() throws Exception {
	}
	
	VectorHeap prueba = new VectorHeap();
	@Test
	public void addTest() {
		String cadena ="Pablo Ortiz, dengue, C";
		String [] arreglo= cadena.split(",");
        Paciente paciente= new Paciente(arreglo[0],arreglo[1],arreglo[2]);
        prueba.add(paciente);
	}
	@Test
	public void sizeTest() {
		//Se probará cuantos elementos tiene ahora el vector (1 paciente, un elemento)
		String cadena ="Pablo Ortiz, dengue, C";
		String [] arreglo= cadena.split(",");
        Paciente paciente= new Paciente(arreglo[0],arreglo[1],arreglo[2]);
        prueba.add(paciente);
		int x = prueba.size();
		 assertTrue(x==1);
	}
	@Test
	public void removeTest() {
		String cadena ="Pablo Ortiz, dengue, C";
		String [] arreglo= cadena.split(",");
        Paciente paciente= new Paciente(arreglo[0],arreglo[1],arreglo[2]);
        prueba.add(paciente);
        String resultado = prueba.remove().toString();
        //System.out.println(resultado);
        int x = 0;
        if(resultado.equals("Pablo Ortiz,  dengue,  C")){
			x = 1;
		}
        assertTrue(x==1);
		
	}
}