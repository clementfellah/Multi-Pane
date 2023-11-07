package application;

public class Personnalisation extends Option{
	
	private String description;
	
	public Personnalisation(float priceOption) {
		super(priceOption);
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
