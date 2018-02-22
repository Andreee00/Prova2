
public class Abitazione extends Immobili
{
	// Dichiarazione attributi
	public static int numAbitazioni=0;
	
	/**
	 * 
	 * @param num=quanti appartamenti ci sono
	 * @param sup=superficie dell'appartamento
	 * @param ind=indirizzo dell'appartamento
	 * @param città=città dove è situato l'appartamento
	 */
	// Costruttore
	public Abitazione(int num, double sup, String ind, String città)
	{
		super(num,sup,ind,città);
		numAbitazioni++;
	}
	
	// Metodi

}
