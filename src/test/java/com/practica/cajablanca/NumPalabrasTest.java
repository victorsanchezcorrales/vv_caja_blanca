   
package com.practica.cajablanca;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class NumPalabrasTest {

    static Editor editor;
    
	@BeforeEach
	void init() {
		editor = new Editor();
		editor.leerFichero("fichero.txt");	 // el fichero tiene 6 líneas
	}  
	
	@Test
	void Test1(){
        assertThrows(IllegalArgumentException.class, () -> {
        	editor.numPalabras(0, 5, "ALONSO");
        });
	}
	
	@Test
	void Test2(){
        assertThrows(IllegalArgumentException.class, () -> {
        	editor.numPalabras(1, 7, "ALONSO");
        });
	}
	
	@Test
	void Test3(){
	    Editor editorVacio = new Editor();
	    assertEquals(0, editorVacio.numPalabras(1, 0, "ALONSO"));
	}
	
	@Test
	void Test4(){
	    assertEquals(0, editor.numPalabras(1, 1, "ALONSO"));
	}
	
	@Test
	void Test5(){
	    assertEquals(0, editor.numPalabras(4, 5, "FERNANDO"));
	}
	
	@Test
	void Test6(){
	    assertEquals(1, editor.numPalabras(4, 5, "ALONSO"));
	}
}
