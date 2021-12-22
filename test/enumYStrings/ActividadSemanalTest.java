package enumYStrings;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ActividadSemanalTest {
	
	private Hour horas;
	private Hour hora;
	private ActividadSemanal futbolJueves;
	private ActividadSemanal tennisMartes;
	private  ActividadSemanal futbolMartes;
	private ActividadSemanal runningLunes;
	private ActividadSemanal basketViernes;
	private ActividadSemanal jabalinaMiercoles;
	private SecretariaDeDeporte secretaria;
	
	@BeforeEach																																		
	public void setUp() {
		horas = new Hour(15,0);
		hora = new Hour(1,0);
		futbolJueves = new ActividadSemanal(DiaDeLaSemana.JUEVES, 15, 2, Deporte.FUTBOL);
		tennisMartes = new ActividadSemanal(DiaDeLaSemana.MARTES, 16, 1, Deporte.TENNIS);
		futbolMartes = new ActividadSemanal(DiaDeLaSemana.MARTES, 9, 1, Deporte.FUTBOL);
		runningLunes = new ActividadSemanal(DiaDeLaSemana.LUNES, 10, 2, Deporte.RUNNING);
		basketViernes = new ActividadSemanal(DiaDeLaSemana.VIERNES, 13, 2, Deporte.BASKET);
		jabalinaMiercoles = new ActividadSemanal(DiaDeLaSemana.MIERCOLES, 8, 2, Deporte.JABALINA);
		secretaria = new SecretariaDeDeporte();
		
		secretaria.agregarActividad(basketViernes);
		secretaria.agregarActividad(futbolJueves);
		secretaria.agregarActividad(tennisMartes);
		secretaria.agregarActividad(futbolMartes);
		secretaria.agregarActividad(runningLunes);
		secretaria.agregarActividad(jabalinaMiercoles);
	}
	
	
	/*
	@Test
	public void actividadesSemalesDeFutbolTest() {
		List <ActividadSemanal> soloFutbol = secretaria.actividadesFutbol();
		assertTrue(soloFutbol.contains(futbolJueves));
		assertTrue(soloFutbol.contains(futbolMartes));
		assertFalse(soloFutbol.contains(basketViernes));
	}
	
	
	
	@Test 
	public void actividadesSemanalesDeDificultadTest() {
		List <ActividadSemanal> actividesDeDificultad = secretaria.actividadesDeDificultad(3);
		assertTrue(actividesDeDificultad.contains(tennisMartes));
		assertFalse(actividesDeDificultad.contains(jabalinaMiercoles));
	}
	
	@Test void horasTotalesDeActividades() {
		Integer totalDeHoras = secretaria.totalDeHoras();
		assertEquals(totalDeHoras,10);
	}
	
	@Test void elDeMenorPrecioParaElDeporte() {
		ActividadSemanal actividad = secretaria.deMenorCostoPara(Deporte.FUTBOL);
		assertEquals(futbolMartes, actividad);
	}
	
	@Test void laActividadSemanalMasEconomica() {
		Map <Deporte,ActividadSemanal> mapa = secretaria.lasMasEconomicas();
		assertTrue(mapa.values().contains(futbolMartes));
		assertFalse(mapa.values().contains(futbolJueves));
	}*/
	
	public static void main(String[] args) {
		ActividadSemanal futbolMartes;
		ActividadSemanal tennisMartes;
		 SecretariaDeDeporte secretaria;
		secretaria = new SecretariaDeDeporte();
		futbolMartes = new ActividadSemanal(DiaDeLaSemana.MARTES, 9, 1, Deporte.FUTBOL);
		tennisMartes = new ActividadSemanal(DiaDeLaSemana.MARTES, 16, 1, Deporte.TENNIS);
		secretaria.agregarActividad(tennisMartes);
		secretaria.agregarActividad(futbolMartes);
		secretaria.imprimirActividades();
		
	}
	
}
