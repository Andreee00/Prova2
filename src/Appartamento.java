//prova2


public class Appartamento extends Immobili 
{
	// Dichiarazione attributi
	private int piano;
	private char ascensore;
	private int numTerrazzi;
	public static int numAppartamenti=0;
	
	/**
	 * 
	 * @param num=numero di stanze
	 * @param sup=superficie appartamento
	 * @param ind=indirizzo dell'appartamento
	 * @param città=città dell'appartamento
	 * @param piano=specificare il piano dell'appartamento
	 * @param asc=presenza ascensore
	 * @param numTe=quante terrazze ci sono a disposizione
	 */
	
	// Costruttore
	public Appartamento(int num, double sup, String ind, String città, int piano, char asc, int numTe)
	{
		super(num, sup, ind, città);
		this.piano=piano;
		ascensore=asc;
		numTerrazzi=numTe;
		numAppartamenti++;
	}
	
	// Metodi
	public String toString()
	{
		return super.toString()+"\t Piano in cui è situato: "+piano+"\t Raggiungibile tramite ascensore S/N: "+ascensore+"\t Numero terrazzi: "+numTerrazzi+".";
	}
	public int getPiano()
	{
		return piano;
	}
	public char getAscensore()
	{
		return ascensore;
	}
	public void setAscensore(char asc)
	{
		ascensore=asc;
	}
	public int getNumTerrazzi()
	{
		return numTerrazzi;
	}
}
