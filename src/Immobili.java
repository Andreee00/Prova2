
public class Immobili 
{
	// Dichiarazione attributi
	private int numStanze;
	private double superficie;
	private String indirizzo;
	private String città;
	/**
	 * 
	 * @param num=numero di stanze
	 * @param sup=superficie della stanza
	 * @param ind=indirizzo
	 * @param città=città dove è situato l'appartamento
	 */
	// Costruttore
	public Immobili(int num, double sup, String ind, String città)
	{
		numStanze=num;
		superficie=sup;
		indirizzo=ind;
		this.città=città;
	}
	
	// Metodi
	public String toString()
	{
		return "Numero Stanze: "+numStanze+"\t Superficie: "+superficie+"\t Indirizzo: "+indirizzo+"\t Città: "+città;
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
	public String getCittà()
	{
		return città;
	}
}
