package application;

public class Velo {
	
	private String libelle;
	private String type;
	private double price;
	private String marque;
	
	public Velo (String libelle, String type, double price, String marque) {
		this.libelle = libelle;
		this.type = type;
		this.price = price;
		this.marque = marque;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

}
