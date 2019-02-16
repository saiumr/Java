package pk;

public class Person{
	public 	class head{
		public head(){
			this.height = Person.this.height*1/7.0;
		}
		public String toString(){
			return "head's height is:"+this.height;
		}
		public double height;
	};
	public class body{
		public double height;
		public body(){
			this.height = Person.this.height*6/7.0;
		}
		public String toString(){
			return "body height:"+this.height;
		}
	};

	public Person(int height,int age,String name){
		this.height = height;
		this.age = age;
		this.name = name;
		this.h = new head();
		this.b = new body();
	}

	public String toString(){
		return this.name+"'s info:" + h.toString() + b.toString();	
	}

	public head h;
	public body b;
	public int height;
	public int age;
	public final String name;
};
