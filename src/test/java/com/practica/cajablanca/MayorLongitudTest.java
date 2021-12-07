package com.practica.cajablanca;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;

public class MayorLongitudTest {

    static Editor editor;
	
	@Test
	void Test1() throws EmptyCollectionException{
		editor = new Editor();
	    assertEquals(null, editor.mayorLongitud());
	}
	
	@Test
	void Test4() throws EmptyCollectionException{
		editor = new Editor();
		editor.leerFichero("ficheroConUnaPalabra.txt");
	    assertEquals("HOLA", editor.mayorLongitud());
	}
	
	@Test
	void Test5() throws EmptyCollectionException{
		editor = new Editor();
		editor.leerFichero("ficheroCamino5.txt");
	    assertEquals("ADIOS", editor.mayorLongitud());
	}
	
	@Test
	void Test6() throws EmptyCollectionException{
		editor = new Editor();
		editor.leerFichero("ficheroCamino6.txt");
	    assertEquals("ADIOS", editor.mayorLongitud());
	}
}
