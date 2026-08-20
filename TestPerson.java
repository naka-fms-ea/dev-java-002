import java.util.ArrayList;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Person personTest1 = new Person("surnameTest1", "firstNameTest1", 43, "Allée Test1", new City("villeTest1", "paysTest1"));
		//Person personTest2 = new Person("surnameTest2", "firstNameTest2", 44);
		//Person personTest3 = new Person("surnameTest3", "firstNameTest3");
		
		//System.out.println(personTest1);
		//System.out.println(personTest2);
		//System.out.println(personTest3);
		
		Person macron = new Person("Macron", "Emmanuel", 43, "habitant L'Elysée à Paris", new City("Amiens", "France"));
		Person sarkozy = new Person("Sarkozy", "Nicolas", 66, "habitant Paris", new City("Paris", "France", 2000000));
		Person johnson = new Person("Johnson", "Boris", 56, "habitant Downing street à London", new City("New York", "Etats-unis"));
		Person depardieu = new Person("Depardieu", "Gerard", 72, "habitant Moscou", new City("Châteauroux", "France"));
		Person kravitz = new Person("Kravitz", "lenny", 56, "habitant Hotel particulier à Paris", new City("New York", "USA"));
		Person lawrence = new Person("Lawrence", "jennifer", 30, "habitant Louisville aux USA", new City("Indian Hills", "USA"));
		
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(macron);
		personList.add(sarkozy);
		personList.add(johnson);
		personList.add(depardieu);
		personList.add(kravitz);
		personList.add(lawrence);
		
		System.out.println("________________________________________________________________________________________________________");
		System.out.println("Liste des personnalités");
		
		System.out.println(macron);
		System.out.println(sarkozy);
		System.out.println(johnson);
		System.out.println(depardieu);
		System.out.println(kravitz);
		System.out.println(lawrence);
		
		 for (int i = 0; i < personList.size(); i++) {
			 
			if(personList.get(i).getAddress().contains("Paris") == false && personList.get(i).getAddress().contains("France") == false && personList.get(i).getCityOfBirth().getCity().contains("Paris") == false && personList.get(i).getCityOfBirth().getCountry().contains("France") == false) { 
				personList.remove(i);
			}
		
		 }
					

		
		System.out.println("------------------------------------");
		System.out.println("Liste après notre filtre");
		
		for(Person test : personList) {
			System.out.println(test);
		}
		
		
		
		
		
	}

}
