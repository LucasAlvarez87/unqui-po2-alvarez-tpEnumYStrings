package enumYStrings;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class coloresTest {
	
	
	@BeforeEach																																		
	public void setUp() {
		
	}
	
	@Test 
	public void lasDescripcionesDeLosColores() {
		String descripcionRojo = Color.ROJO.getDescripcion();
		String descripcionGris = Color.GRIS.getDescripcion();
		String descripcionAmarillo = Color.AMARILLO.getDescripcion();
		String descripcionMiel = Color.MIEL.getDescripcion();
		
		assertEquals(descripcionRojo, "Color Rojo");
		assertEquals(descripcionGris, "Color Gris");
		assertEquals(descripcionAmarillo, "Color Amarillo");
		assertEquals(descripcionMiel, "Color Miel");
	}

}
