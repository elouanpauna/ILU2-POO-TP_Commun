package model;

public class ReservationSpectacle extends Reservation{
	private int numZone;
	
	public ReservationSpectacle(int jour,int mois,int numZone,int numChaise) {
		super(jour,mois,numChaise);
		this.numZone=numZone;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine = new StringBuilder();
		chaine.append("Le " + jour + "/" + mois +"\n" + " Spectacle à zone " + numZone + " place " + numRes + ".");
		return chaine.toString();
	}
}
