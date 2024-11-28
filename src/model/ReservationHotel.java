package model;

public class ReservationHotel extends Reservation {
	private int numLitsSimples;
	private int numLitsDoubles;
	
	public ReservationHotel(int jour,int mois,int numLitsSimples,int numLitsDoubles,int numChambre) {
		super(jour,mois,numChambre);
		this.numLitsSimples=numLitsSimples;
		this.numLitsDoubles=numLitsDoubles;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine= new StringBuilder();
		chaine.append("Le "+ jour+"/"+mois+"\n" + " Chambre "+ numRes + " avec " + numLitsSimples + " lits simples et " + numLitsDoubles+ " lits doubles.");
		return chaine.toString();
	}
}
