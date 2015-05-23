package modello;
/**
 * Interfaccia che ci serve per astrarre sul modo in cui ogni cassa decide di selezionare il prossimo
 * cliente da servire(possiamo infatti decidere di introdurre o meno criteri prioritari)
 * @author incre
 *
 */
public interface ICassa {

		public abstract void servinext();
}
