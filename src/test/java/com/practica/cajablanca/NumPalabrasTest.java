   
package com.practica.cajablanca;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;


public class NumPalabrasTest {

    static Editor editor;
    
	@BeforeEach
	void init() {
		editor = new Editor();
		editor.leerFichero("fichero.txt");	 // el fichero tiene 6 líneas
	}  
	
    @DisplayName("Camino 1")
	@Test
	void Test1(){
        assertThrows(IllegalArgumentException.class, () -> {
        	editor.numPalabras(0, 5, "ALONSO");
        });
	}
    @DisplayName("Camino 2")
	@Test
	void Test2(){
        assertThrows(IllegalArgumentException.class, () -> {
        	editor.numPalabras(1, 7, "ALONSO");
        });
	}
	
    @DisplayName("Camino 3")
	@Test
	void Test3(){
	    Editor editorVacio = new Editor();
	    assertEquals(0, editorVacio.numPalabras(1, 0, "ALONSO"));
	}
    
    @DisplayName("Camino 4")
	@Test
	void Test4(){
	    assertEquals(0, editor.numPalabras(1, 1, "ALONSO"));
	}
	
    @DisplayName("Camino 5")
	@Test
	@Disabled()
	void Test5() throws EmptyCollectionException{
		// la condición de segundo while siempre será true si se llega por primera vez
    }
    
    @DisplayName("Camino 6")
	@Test
	void Test6(){
	    assertEquals(0, editor.numPalabras(4, 5, "ALONSO"));
	}
	
    @DisplayName("Camino 7")
	@Test
	void Test7(){
	    assertEquals(1, editor.numPalabras(4, 5, "NUÑEZ"));
	}
}
