package com.practica.cajablanca;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;

public class SustituirPalabraTest {
    
	static Editor editor;
	
    @DisplayName("Camino 1")
	@Test
	void Test1() throws EmptyCollectionException{
		editor = new Editor();
	    editor.sustituirPalabra("HOLA","ADIOS");
	    assertTrue(editor.editIsEmpty());
	    assertEquals(0, editor.size());
	}
    
    @DisplayName("Camino 2")
	@Test
	@Disabled()
	void Test2() throws EmptyCollectionException{
		// si el editor no está vacío, la condición del while no puede ser false
	}
   
    @DisplayName("Camino 3")
	@Test
	@Disabled()
	void Test3() throws EmptyCollectionException{
		// si el editor no está vacío, la condición del while no puede ser false
	}
    
    @DisplayName("Camino 4")
	@Test
	void Test4() throws EmptyCollectionException{
		editor = new Editor();
		editor.leerFichero("ficheroConUnaPalabra.txt");
	    editor.sustituirPalabra("HOLA","ADIOS");
	    assertEquals("[ADIOS]", editor.getLinea(1).toString());
	}
    
    @DisplayName("Camino 5")
	@Test
	void Test5() throws EmptyCollectionException{
		editor = new Editor();
		editor.leerFichero("ficheroConUnaPalabra.txt");
	    editor.sustituirPalabra("ADIOS","HOLA");
	    assertEquals("[HOLA]", editor.getLinea(1).toString());
	}
}
