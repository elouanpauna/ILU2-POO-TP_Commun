package model;

public abstract class Reservation {
	protected int jour;
	protected int mois;
	protected int numRes;
	
	public Reservation(int jour,int mois,int numRes) {
		this.jour=jour;
		this.mois=mois;
		this.numRes=numRes;
	}
	
	public abstract String toString();
}
