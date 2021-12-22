package enumYStrings;

public enum Deporte {
	
	RUNNING{
		
		public int getComplejidad() {
			return 1;
		}
		
	},FUTBOL{
		
		public int getComplejidad() {
			return 2;
		}
		
	},BASKET{
		
		public int getComplejidad() {
			return 2;
		}
		
	},TENNIS{
		
		public int getComplejidad() {
			return 3;
		}
		
	},JABALINA{
		
		public int getComplejidad() {
			return 4;
		}
	};

	int complejidad;
	
	abstract public int getComplejidad();
	
	public int getCosto() {
		return this.getComplejidad() * 200;
	}
}
