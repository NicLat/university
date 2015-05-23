package model;

public interface IUfficio {

	public boolean serviCliente(int tipo);
	public void incrementaCoda(int tipo);
	
	public int getServito(int tipo);
	public int getCoda(int tipo);
	public PannelloTurni getPannelloTurni();
}
