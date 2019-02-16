package pk;

public class Person{
	public enum SEXY{
		MALE,FEMALE
	}
	public Person(String name,int height,int age,SEXY sexy){
		this.name = name;
		this.height = height;
		this.age = age;
		this.sexy = sexy;
	}
	public String toString(){
		return name+"'s height:"+height+",age:"+age+",sexy:"+sexy;
	}
	public final SEXY sexy;
	public final String name;
	public int height;
	public int age;
};
