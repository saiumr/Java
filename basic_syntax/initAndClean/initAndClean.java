class initAndClean{
public static void main(String[] args){
	int[] a={1,2,3,4};
	int[] b = a;
	b[1]=10;
	for(int i : a)
		System.out.print(i+" ");
	System.out.println();
	print("2",3,false,new initAndClean());	

	Hot hot = Hot.LOW;
	System.out.println(hot);
	for(Hot h : Hot.values())
		System.out.println(h+" h.ordinal():"+h.ordinal());
}

public enum Hot{
	LOW,MIDIUM,HIGH
};

public static void print(Object ... args){
	for(Object o : args)
		System.out.print(o+" ");
	System.out.println();
}
};
