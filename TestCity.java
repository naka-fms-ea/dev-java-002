
public class TestCity {

	public static void main(String[] args) {
		
		City toulouse = new City("Toulouse", "France", 450000);
		//City marseille = new City("Marseille", "France", 892000);
		//City lyon = new City("Lyon", "France", 523000);
		//City nice = new City("Nice", "France", 360000);
		//City rabat = new City("Rabat", 450000);
		

		//System.out.println(toulouse.toString());
		//System.out.println(marseille.toString());
		//System.out.println(lyon.toString());
		//System.out.println(nice.toString());
		//System.out.println(rabat);
		
		//toulouse.addInhabitants(20000);
		
		//toulouse.setNumberInhabitants(-200);
		
		//toulouse.addInhabitants(-100000);
		
		//System.out.println(toulouse.toString());
		
		//rabat.setCountry("Maroc");
		
		//System.out.println(rabat);
		
		toulouse.display();
		
		System.out.println(toulouse); //Résultat : City@2a139a55.
		
		//Nombre d'objets / villes instanciés.
		System.out.println(City.getCountInstance());
		
		
	}

}
