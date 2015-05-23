package modello;

public class Casella {
	
		public static final char CONTENUTO_LIBERA = '-';
		public static final char CONTENUTO_BOMBA = 'M';
		public static final String CONTENUTO_NUMERO = "12345678";
		public static final char STATO_LIBERATA = 'F';
		public static final char STATO_BANDIERINA = 'P';
		public static final char STATO_OSCURA = 'D';
	
		private char contenuto;		// 'M' mina, '-' niente, '1 .. 8' numero di mine adiacenti
		private char stato;			// 'F' liberata, 'P' bandierina, 'D' ancora oscura
		
		
		public void setContenuto(char contenuto) {
			if(contenuto == CONTENUTO_BOMBA || contenuto == CONTENUTO_LIBERA || 
					( CONTENUTO_NUMERO.indexOf(contenuto)!=-1))
				this.contenuto = contenuto;
			//else 
			//	this.contenuto = ' ';
		}
		public void setStato(char stato) {
			if(stato == STATO_LIBERATA || stato == STATO_BANDIERINA || stato == STATO_OSCURA)
				this.stato = stato;
			//else 
			//	this.stato = 'D';
		}

		
		public Casella(char contenuto, char stato) {
			super();
			setContenuto(contenuto);
			setStato(stato);
		}	
		

		public char getStato() {
			return stato;
		}
		public char getContenuto() {
			return contenuto;
		}

}
