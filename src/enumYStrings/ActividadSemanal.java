package enumYStrings;

public class ActividadSemanal {
	
	private DiaDeLaSemana dia;
	
	private int hora;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, int hora, int duracion, Deporte deporte) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public DiaDeLaSemana getDia() {
		return dia;
	}

	public int getHora() {
		return hora;
	}

	public int getDuracion() {
		return duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}
	
	public int getCosto() {
		return this.getDia().getCosto() + this.getDeporte().getCosto();
	}
	
	@Override
	public String toString() {
		return "Deporte: " + this.getDeporte().toString() + " Dia: " + this.getDia().toString() + " A LAS: " + this.getHora() + ". Duración: " + this.getDuracion() + " hora(s)." ;
	}
	
	
	
}
