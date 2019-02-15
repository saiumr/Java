class controlFlow{
public static void main(String[] args){
	int[] a = {1,2,3,4,5};
	for(int i : a)
		System.out.print(i+",");
	System.out.println();
	
outer:
	for(int i=0;i<10;i++){
		inner:
		for(int j=0;j<10;j++){
			System.out.println(i*j);
			if(j==5)
				break outer;
		}
	}
}
};
