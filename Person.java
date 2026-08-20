
public class Person {

	private String lastName;
	private String firstName;
	private int age;
	private String address;
	private City cityBirth;
	
	
	public Person(String lastName, String firstName, int age, String address, City cityBirth) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
		this.cityBirth = cityBirth;
	}
		
	public Person(String lastName, String firstName, int age, String address) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
	}
	
	/**
	 * @param lastName
	 * @param firstName
	 * @param age
	 */
	public Person(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	/**
	 * @param lastName
	 * @param firstName
	 */
	public Person(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}

	//Setter.
	public void setSurname(String lastName) {
		this.lastName = lastName;
	}
	
	//Setter.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//Setter.
	public void setAge(int age) {
		this.age = age;
	}
	
	//Setter.
	public void setAddress(String address) {
		this.address = address;
	}
	
	//Setter.
	public void setCityOfBirth(City cityOfBirth) {
		this.cityBirth.setCity(cityOfBirth.getCity());
		this.cityBirth.setCountry(cityOfBirth.getCountry());
		this.cityBirth.setNumberInhabitants(cityOfBirth.getNbInhabitants());
	}
		
	//Getter.
	public String getLastName() {
		return lastName;
	}
	
	//Getter.
	public String getFirstName() {
		return firstName;
	}
	
	//Getter.
	public int getAge() {
		return age;
	}
	
	//Getter.
	public String getAddress() {
		return address;
	}
	
	//Getter.
	public City getCityOfBirth() {
		return cityBirth;
	}
	
	//Méthode permettant d'afficher les attributs d'un objet Person.
	//public String toString() {
	//	return "Person [lastName=" + this.getLastName() + ", firstName=" + this.getFirstName() + ", age=" + this.getAge() + ", address=" + this.getAddress() + "]";	
	//}
	
	//Méthode permettant d'afficher les attributs d'un objet Person.
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName  + ", age=" + age + ", address=" + address + "]Born" + cityBirth;	
	}
	
	
	
}
