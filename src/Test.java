// // Esercizio N°2 pag. 256 + vettori
import java.util.Scanner;
public class Test 
{
	public static void main(String[] args) 
	{
		String risp, ind, newInd;
		char pi, asc;
		int op, pos;
		Scanner tastiera=new Scanner(System.in);
		System.out.print("Inserisci il numero di immobili: ");
		int n=tastiera.nextInt();
		Abitazione vetAb[]=new Abitazione[n];
		Villa vetVil[]=new Villa[n];
		Appartamento vetAp[]=new Appartamento[n];
		carica(vetAb, vetVil, vetAp, tastiera);
		int j=Abitazione.numAbitazioni;
		int k=Villa.numVille;
		int t=Appartamento.numAppartamenti;
		if(j!=0)
		{
			System.out.println("\t\t\t\t Abitazioni");
			visualizza(vetAb, j);
		}
		if(k!=0)
		{
			System.out.println("\t\t\t\t Ville");
			visualizza(vetVil, k);
		}
		if(t!=0)
		{
			System.out.println("\t\t\t\t Appartamenti");
			visualizza(vetAp, t);
		}
		do
		{
			menu();
			op=tastiera.nextInt();
			switch(op)
			{
				case 1:
					System.out.println("\t\t\t\t Abitazioni in ordine crescente di grandezza");
					ordina(vetAb, j);
					visualizza(vetAb,j);
					break;
				case 2:
					System.out.println("\t\t\t\t Ville in ordine crescente di grandezza");
					ordina(vetVil, k);
					visualizza(vetVil, k);
					break;
				case 3:
					System.out.println("\t\t\t\t Appartamenti in ordine crescente di grandezza");
					ordina(vetAp, t);
					visualizza(vetAp,t);
					break;
				case 4:
					tastiera.nextLine();
					System.out.print("Inserisci l'indirizzo della villa a cui vuoi modificare la piscina: ");
					ind=tastiera.nextLine();
					ind=ind.toUpperCase();
					pos=ricerca(vetVil, k, ind);
					if(pos!=-1)
					{
						System.out.print("Ora la villa ha la piscina? S/N: ");
						risp=tastiera.nextLine();
						risp=risp.toUpperCase();
						pi=risp.charAt(0);
						while(pi!='S' && pi!='N')
						{
							System.out.print("Errore! Inserisci solo S(si) o N(no): ");
							risp=tastiera.nextLine();
							risp=risp.toUpperCase();
							pi=risp.charAt(0);
						}
						vetVil[pos].setPiscina(pi);
						System.out.println("La villa ha la piscina: "+vetVil[pos].getPiscina()+"\t Città: "+vetVil[pos].getCittà());
					}
					else
						System.out.println("Villa non trovata!");
					break;
				case 5:
					tastiera.nextLine();
					ordina(vetAp, t);
					System.out.print("Inserisci l'indirizzo dell'appartamento a cui vuoi modificare l'attributo ascensore: ");
					ind=tastiera.nextLine();
					ind=ind.toUpperCase();
					pos=ricercaBinaria(vetAp, t, ind);
					if(pos!=-1)
					{
						System.out.print("Ora l'appartamento è raggiungibile tramite ascensore? S/N: ");
						risp=tastiera.nextLine();
						risp=risp.toUpperCase();
						asc=risp.charAt(0);
						while(asc!='S' && asc!='N')
						{
							System.out.print("Errore! Inserisci solo S(si) o N(no): ");
							risp=tastiera.nextLine();
							risp=risp.toUpperCase();
							asc=risp.charAt(0);
						}
						vetAp[pos].setAscensore(asc);
						System.out.println("L'appartamento è raggiungibile tramite ascensore: "+vetAp[pos].getAscensore()+"\t Città: "+vetAp[pos].getCittà());
						System.out.println("\t\t\t\t Appartamenti in ordine crescente di grandezza");
						visualizza(vetAp, t);
					}
					else
						System.out.println("Appartamento non trovato!");
					break;
				case 6:
					tastiera.nextLine();
					System.out.print("Inserisci l'indirizzo dell'abitazione per poi inserire il nuovo indirizzo: ");
					ind=tastiera.nextLine();
					ind=ind.toUpperCase();
					pos=ricerca(vetAb, j, ind);
					if(pos!=-1)
					{
						System.out.print("Inserisci il nuovo indirizzo: ");
						newInd=tastiera.nextLine();
						newInd=newInd.toUpperCase();
						vetAb[pos].setIndirizzo(newInd);
						System.out.println("Nuovo indirizzo: "+vetAb[pos].getIndirizzo()+"\t Città: "+vetAb[pos].getSuperficie()+"\t Numero stanze: "+vetAb[pos].getNumStanze());
					}
					else
						System.out.println("Abitazione non trovata!");
					break;
				case 7:
					tastiera.nextLine();
					System.out.print("Inserisci l'indirizzo dell'appartamento di cui vuoi visualizzare piano e numero di terrazzi: ");
					ind=tastiera.nextLine();
					ind=ind.toUpperCase();
					pos=ricerca(vetAb, j, ind);
					if(pos!=-1)
					{
						System.out.println("Nuovo indirizzo: "+vetAp[pos].getPiano()+"\t Numero terrazzi"+vetAp[pos].getNumTerrazzi());
					}
					else
						System.out.println("Appartamento non trovato!");
					break;
				case 0:
					System.out.println("Esecuzione terminata!");
					break;
			}
		}
		while(op!=0);
	}
	public static void carica(Abitazione vetAb[], Villa vetVil[], Appartamento vetAp[], Scanner tastiera)
	{
		int num, numP, piano, numT;
		double sup, supG;
		String ind, città, risp;
		char pisc, asc, tipo;
		for(int i=0; i<vetAb.length; i++)
		{
			System.out.print("Inserisci il numero di stanze del "+(i+1)+"° immobile: ");
			num=tastiera.nextInt();
			System.out.print("Inserisci la superficie del "+(i+1)+"° immobile: ");
			sup=tastiera.nextDouble();
			tastiera.nextLine();
			System.out.print("Inserisci l'indirizzo del "+(i+1)+"° immobile: ");
			ind=tastiera.nextLine();
			ind=ind.toUpperCase();
			System.out.print("Inserisci la città del "+(i+1)+"° immobile: ");
			città=tastiera.nextLine();
			città=città.toUpperCase();
			System.out.print("Il "+(i+1)+"° immobile è: V(villa), A(appartamento), S(abitazione): ");
			risp=tastiera.nextLine();
			risp=risp.toUpperCase();
			tipo=risp.charAt(0);
			while(tipo!='V' && tipo!='A' && tipo!='S')
			{
				System.out.print("Errore! Inserisci uno dei seguenti caratteri: V(villa), A(appartamento), S(altro): ");
				risp=tastiera.nextLine();
				risp=risp.toUpperCase();
				tipo=risp.charAt(0);
			}
			switch(tipo)
			{
				case 'V':
					System.out.print("Inserisci il numero di piani della "+(i+1)+"° villa: ");
					numP=tastiera.nextInt();
					System.out.print("Inserisci la superficie del giardino della "+(i+1)+"° villa: ");
					supG=tastiera.nextDouble();
					tastiera.nextLine();
					System.out.print("La "+(i+1)+"° villa ha la piscina? S/N: ");
					risp=tastiera.nextLine();
					risp=risp.toUpperCase();
					pisc=risp.charAt(0);
					while(pisc!='S' && pisc!='N')
					{
						System.out.print("Errore! Inserisci solo S(si) o N(no): ");
						risp=tastiera.nextLine();
						risp=risp.toUpperCase();
						pisc=risp.charAt(0);
					}
					vetVil[Villa.numVille]=new Villa(num, sup, ind, città, numP, supG, pisc);
					break;
				case 'A':
					System.out.print("Inserisci il piano del "+(i+1)+"° appartamento: ");
					piano=tastiera.nextInt();
					tastiera.nextLine();
					System.out.print("Il "+(i+1)+"° appartamento è raggiungibile tramite ascensore? S/N: ");
					risp=tastiera.nextLine();
					risp=risp.toUpperCase();
					asc=risp.charAt(0);
					while(asc!='S' && asc!='N')
					{
						System.out.print("Errore! Inserisci solo S(si) o N(no): ");
						risp=tastiera.nextLine();
						risp=risp.toUpperCase();
						asc=risp.charAt(0);
					}
					System.out.print("Inserisci il numero di terrazzi del "+(i+1)+"° appartamento: ");
					numT=tastiera.nextInt();
					vetAp[Appartamento.numAppartamenti]=new Appartamento(num, sup, ind, città, piano, asc, numT);
					break;
				case 'S':
					vetAb[Abitazione.numAbitazioni]=new Abitazione(num, sup, ind, città);
					break;
			}// End switch
		}// End for
	}// End carica
	public static void visualizza(Immobili vet[], int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.println((i+1)+"°- "+vet[i].toString());
		}
	}
	public static void menu()
	{
		System.out.println("Scegli una delle seguenti operazioni:");
		System.out.println(" 1- Visualizzare in ordine crescente di grandezza tutte le abitazioni;");
		System.out.println(" 2- Visualizzare in ordine crescente di grandezza tutte le ville;");
		System.out.println(" 3- Visualizzare in ordine crescente di grandezza tutti gli appartamenti;");
		System.out.println(" 4- Modificare l'attributo piscina di una villa il cui indirizzo è dato in input \n    e visualizzarlo insieme alla città;");
		System.out.println(" 5- Modificare l'attributo ascensore di un appartamento il cui indirizzo è dato in input \n    e visualizzarlo insieme alla città; dopodicchè visualizzare tutti gli \n    appartamenti in ordine crescente di grandezza;");
		System.out.println(" 6- Modificare l'indirizzo di un'abitazione il cui indirizzo è dato in input \n    e visualizzare superficie e numero stanze di tale abitazione");
		System.out.println(" 7- Visualizzare il piano e il numero di terrazzi di un appartamento il cui indirizzo \n    è dato in input;");
		System.out.println(" 0- Terminare l'esecuzione.");
	}
	public static void ordina(Immobili vet[], int n)
	{
		Immobili app;
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(vet[i].getSuperficie()>vet[j].getSuperficie())
				{
					app=vet[i];
					vet[i]=vet[j];
					vet[j]=app;
				}
			}
		}
	}
	public static int ricerca(Immobili vet[], int n, String ind)
	{
		int posizione=-1;
		int i=0;
		while(i<n && posizione==-1)
		{
			if(vet[i].getIndirizzo().equals(ind))
				posizione=i;
			else
				i++;
		}
		return posizione;
	}
	public static int ricercaBinaria(Immobili vet[], int n, String ind)
	{
		int posizione=-1, inf=0, sup=n-1, med;
		while(inf<=sup && posizione==-1)
		{
			med=(inf+sup)/2;
			if(vet[med].getIndirizzo().equals(ind))
				posizione=med;
			else
			{
				if(vet[med].getIndirizzo().compareTo(ind)>0)
					inf=med+1;
				else
					sup=med-1;
			}
		}
		return posizione;
	}
}
