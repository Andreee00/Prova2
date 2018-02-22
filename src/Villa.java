
public class Villa extends Immobili
{
	// Dichiarazione attributi
	private int numPiani;
	private double supGiardino;
	private char piscina;
	public static int numVille=0;
	/**
	 * 
	 * @param num=numero dei piani dell'appartamento
	 * @param sup=superficie del giardino
	 * @param ind=
	 * @param citt=à
	 * @param numP=
	 * @param supG=
	 * @param pisc=presenza della piscina
	 */
	// Costruttore
	public Villa(int num, double sup, String ind, String città, int numP, double supG, char pisc)
	{
		super(num, sup, ind, città);
		numPiani=numP;
		supGiardino=supG;
		piscina=pisc;
		numVille++;
	}
	
	// Metodi
	public String toString()
	{
		return super.toString()+"\t Numero piani: "+numPiani+"\t Superficie Giardino: "+supGiardino+"\t Piscina S/N: "+piscina+".";
	}
	public int getNumPiani()
	{
		return numPiani;
	}
	public double getSupGiardino()
	{
		return supGiardino;
	}
	public void setSupGiardino(double sup)
	{
		supGiardino=sup;
	}
	public char getPiscina()
	{
		return piscina;
	}
	public void setPiscina(char pisc)
	{
		piscina=pisc;
	}
}
