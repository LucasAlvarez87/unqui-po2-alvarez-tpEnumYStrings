package enumYStrings;

public enum DiaDeLaSemana {
	LUNES{
		
		public int getCosto() {
			return 500;
		}
		
	},MARTES{
		
		public int getCosto() {
			return 500;
		}
		
	},MIERCOLES{
		
		public int getCosto() {
			return 500;
		}
		
	},JUEVES{
		
		public int getCosto() {
			return 1000;
		}
		
	},VIERNES{
		
		public int getCosto() {
			return 1000;
		}
		
	},SABADO{
		
		public int getCosto() {
			return 1000;
		}
		
	},DOMINGO{
		
		public int getCosto() {
			return 1000;
		}
		
	};

	abstract public int getCosto();
}
