package com.practica.cajablanca;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;

public class MayorLongitudTest {

    static Editor editor;
	
    @DisplayName("Camino 1")
	@Test
	void Test1() throws EmptyCollectionException{
		editor = new Editor();
	    assertEquals(null, editor.mayorLongitud());
	}
	
    @DisplayName("Camino 2")
	@Test
	@Disabled()
	void Test2() throws EmptyCollectionException{
		// si entra en el primer if y también entrará en el primer  for 
	}
	
    @DisplayName("Camino 3")
	@Test
	@Disabled()
	void Test3() throws EmptyCollectionException{
		// si entra en el primer for tambien entrará en el segundo
	}
	
    @DisplayName("Camino 4")
	@Test
	void Test4() throws EmptyCollectionException{
		editor = new Editor();
		editor.leerFichero("ficheroConUnaPalabra.txt");
	    assertEquals("HOLA", editor.mayorLongitud());
	}
	
    @DisplayName("Camino 5")
	@Test
	@Disabled()
	void Test5() throws EmptyCollectionException{
		// siempre se ejecutará el primer if si se entra en el segundo for
	}
	
    @DisplayName("Camino 6")
	@Test
	@Disabled()
	void Test6() throws EmptyCollectionException{
		// siempre se ejecutará el primer if si se entra en el segundo for
	}
    
	@DisplayName("Prueba adicional")
	@Test
	void Test7() throws EmptyCollectionException{
		editor = new Editor();
		editor.leerFichero("fichero.txt");
	    assertEquals("MENESES", editor.mayorLongitud());
	}
	
}
