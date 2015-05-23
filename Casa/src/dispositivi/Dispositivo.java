package dispositivi;

public interface Dispositivo {

	public void accendi() throws ErroreDispositivo;
	public void spegni() throws ErroreDispositivo ;
	public boolean operativo() throws ErroreDispositivo;
}