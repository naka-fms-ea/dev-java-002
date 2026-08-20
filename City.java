
public class City {
	private String nameCity;
	private String nameCountry;
	private int nbInhabitants;
	private static int countInstance = 0;
	
	
	{
		countInstance++;
	}
	

	//Constructeur.
	public City(String city, String country, int numberInhabitants) {
		setCity(city);
		setCountry(country);
		setNumberInhabitants(numberInhabitants);
	}
	
	//Constructeur.
	public City(String city, int numberInhabitants) {
		setCity(city);
		setNumberInhabitants(numberInhabitants);
	}
	
	//Constructeur.
	public City(String city, String country) {
		setCity(city);
		setCountry(country);;
	}
	
	//Setter.
	public void setCity(String city) {
		this.nameCity = city;
	}
	
	//Setter.
	public void setCountry(String country) {
		this.nameCountry = country;
	}
	
	//Setter.
	public void setNumberInhabitants(int numberInhabitants) {
		if(numberInhabitants < 0)
			throw new RuntimeException("Le nombre d'habitant ne peut être négatif !");
		this.nbInhabitants = numberInhabitants;
	}
	
	//Getter.
	public String getCity() {
		return nameCity;
	}
	
	//Getter.
	public String getCountry() {
		return nameCountry;
	}
	
	//Getter.
	public int getNbInhabitants() {
		return nbInhabitants;
	}
	
	//Méthode permettant d'afficher les attributs d'un objet City.
	//public String toString() {
	//	return "ville de " + this.getCity() + " en " + this.getCountry() + " ayant " + this.getNbInhabitants() + " habitants";	
	//}
	
	
	
	//Méthode permettant de réduire ou d'augmenter le nombre d'habitant d'une ville.
	public void addInhabitants(int numberInhabitants) {
		this.nbInhabitants = this.nbInhabitants + numberInhabitants;
	}
	
	@Override
	public String toString() {
		return "City [nameCity=" + nameCity + ", nameCountry=" + nameCountry + ", nbInhabitants=" + nbInhabitants + "]";
	}

	//Méthode permettant d'afficher les attributs d'une ville.
	public void display() {
		System.out.println("ville de " + this.getCity() + " en " + this.getCountry() + " ayant " + this.getNbInhabitants());
	}
	
	//Méthode permettant de compter le nombre d'instance de la classe City.
	public static int getCountInstance() {	
		return countInstance;
	}

}
