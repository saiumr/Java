import pk.Person;

public class innerClass{
public static void main(String[] args){
	Person person = new Person(170,21,"VisualGMQ");
	System.out.println(person);
	Person.head h = person.new head();
	System.out.println(h);

	Person up = getUniquePerson();
	System.out.println(up);
}

public static Person getUniquePerson(){
	return new Person(170,21,"UniquePerson"){
		public String toString(){
			return super.toString() + ",I am a Unique Person!!!";
		}
	};
}
};
