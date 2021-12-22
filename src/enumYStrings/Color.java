package enumYStrings;

public enum Color {
	ROJO("Color Rojo"){
		
		public Color proximoColor() {
			return GRIS;
		}
		
	}, GRIS("Color Gris"){
		
		public Color proximoColor() {
			return AMARILLO;
		}
		
	}, AMARILLO("Color Amarillo"){
		
		public Color proximoColor() {
			return MIEL;
		}
		
	}, MIEL("Color Miel"){
		
		public Color proximoColor() {
			return ROJO;
		}
	};
	
	String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	private Color(String descripcion) {
		this.descripcion = descripcion;
	}
	
	abstract public Color proximoColor();

}
