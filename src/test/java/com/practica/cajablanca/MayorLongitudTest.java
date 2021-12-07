package com.practica.cajablanca;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;

public class MayorLongitudTest {

    static Editor editor;
    
	@BeforeEach
	void init() {
		editor = new Editor();
		editor.leerFichero("fichero.txt");	 // el fichero tiene 6 líneas
	}  
	
	@Test
	void Test1() throws EmptyCollectionException{
	    assertEquals("FERNANDEZ", editor.mayorLongitud());
	}
	
	
}
