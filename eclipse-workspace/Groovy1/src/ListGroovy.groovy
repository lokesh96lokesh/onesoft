
class ListGroovy {
	public static void main(args){
		List<Integer> list = [1,2,3,4]
		println list[0]
		println list[1]
		println list[3]
		List<Person> persons = list[]
		Person p = new Person("Jim", "Knopf")
		persons[0] = p
		println persons.size()
		println persons[0].firstName
		println persons.get(0).lastName
	}
}
class Person{
	String firstName;
	String lastName;
	Person(String firstName, String lastName){
		this.firstName = firstName
		this.lastName= lastName
	}
}
