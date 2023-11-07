package application;

public class Couleur extends Option{
	
	private String codeCouleur;
	
	public Couleur(float priceOption) {
		super(priceOption);
		// TODO Auto-generated constructor stub
	}

	public String getCodeCouleur() {
		return codeCouleur;
	}

	public void setCodeCouleur(String codeCouleur) {
		this.codeCouleur = codeCouleur;
	}

}
