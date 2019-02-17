class MyException extends Exception{
	public MyException(){}
	public String toString(){
		return "This is my Own exception";
	}
}

public class exception{
public static void main(String[] args){
	try{
		int a=2/0;
	}catch(Exception e){
		System.out.println(e);
	}	
	try{
		System.out.println("I throwed a exception");
		throw new MyException();
	}catch(MyException e){
		System.out.println(e);
	}
}
};
