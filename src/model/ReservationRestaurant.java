package model;

public class ReservationRestaurant extends Reservation{
	private int numService;
	
	public ReservationRestaurant(int jour,int mois,int numService,int numRes ) {
		super(jour,mois,numRes);
		this.numService=numService;
	}
	
	@Override
	public String toString() {
		StringBuilder chaine=new StringBuilder();
		chaine.append("Le " + jour + "/" + mois +"\n" + "Table " + numRes + " pour le ");
		if (numService==1) {
			chaine.append("premier service.");
		}else if (numService==2) {
			chaine.append("deuxième service.");
		}
		return chaine.toString();
	}
}
