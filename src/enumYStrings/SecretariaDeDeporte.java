package enumYStrings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecretariaDeDeporte {
	
	private List <ActividadSemanal> actividadesSemanales = new ArrayList <ActividadSemanal>();

	public List<ActividadSemanal> getActividadesSemanales() {
		return actividadesSemanales;
	}
	
	public void agregarActividad(ActividadSemanal actividad) {
		this.getActividadesSemanales().add(actividad);
	}

	public SecretariaDeDeporte() {
		super();
	}
	
	public List<ActividadSemanal> actividadesFutbol(){
		List<ActividadSemanal> futbol = this.getActividadesSemanales().stream().filter(a -> a.getDeporte().equals(Deporte.FUTBOL)).collect(Collectors.toList());
		return futbol;
	}
	
	public List <ActividadSemanal> actividadesDeDificultad(int dificultad ){
		List <ActividadSemanal> actividadesDeDificultad = 
				this.getActividadesSemanales().stream().filter(a -> a.getDeporte().getComplejidad() ==(dificultad)).collect(Collectors.toList());
		return actividadesDeDificultad;
		
	}
	
	public int totalDeHoras() {
		List <Integer> horas = new ArrayList <Integer>();
		this.getActividadesSemanales().stream().forEach(a -> horas.add(a.getDuracion()));
		return horas.stream().reduce(0, (acumulado,nuevo)-> acumulado + nuevo);
	}
	
	public ActividadSemanal deMenorCostoPara(Deporte deporte) {
		Stream<ActividadSemanal> soloEseDeporte = this.getActividadesSemanales().stream().filter(a -> a.getDeporte().equals(deporte));
		return soloEseDeporte.min(Comparator.comparing(ActividadSemanal :: getCosto)).get();
	}
	
	public Map<Deporte,ActividadSemanal> lasMasEconomicas(){
		Stream<Deporte> losDeportes = Stream.of(Deporte.values());
		List<ActividadSemanal> lasMasBaratas = new ArrayList<ActividadSemanal>();
		losDeportes.forEach( d-> lasMasBaratas.add(this.deMenorCostoPara(d)));
		return lasMasBaratas.stream().collect(Collectors.groupingBy(ActividadSemanal::getDeporte,
                Collectors.collectingAndThen(
                        Collectors.toList(), 
                        values -> values.get(0))));
	}
	
	public void imprimirActividades() {
		this.getActividadesSemanales().stream().forEach(a -> System.out.println(a));
	}
}




