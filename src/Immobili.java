
public class Immobili 
{
	// Dichiarazione attributi
	private int numStanze;
	private double superficie;
	private String indirizzo;
	private String citt�;
	/**
	 * 
	 * @param num=numero di stanze
	 * @param sup=superficie della stanza
	 * @param ind=indirizzo
	 * @param citt�=citt� dove � situato l'appartamento
	 */
	// Costruttore
	public Immobili(int num, double sup, String ind, String citt�)
	{
		numStanze=num;
		superficie=sup;
		indirizzo=ind;
		this.citt�=citt�;
	}
	
	// Metodi
	public String toString()
	{
		return "Numero Stanze: "+numStanze+"\t Superficie: "+superficie+"\t Indirizzo: "+indirizzo+"\t Citt�: "+citt�;
	}
	public int getNumStanze()
	{
		return numStanze;
	}
	public double getSuperficie()
	{
		return superficie;
	}
	public String getIndirizzo()
	{
		return indirizzo;
	}
	public void setIndirizzo(String ind)
	{
		indirizzo=ind;
	}
	public String getCitt�()
	{
		return citt�;
	}
}
