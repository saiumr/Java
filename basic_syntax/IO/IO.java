import java.io.*;
import java.util.*;

public class IO{
public static void main(String[] args){
	File path = new File(".");
	String[] str = path.list();
	System.out.println("当前文件夹下的所有文件:");
	for(String i : str)
		System.out.println(i+" ");

	File file = new File("./test.txt");
	if(!file.exists()){
		try{
			file.createNewFile();
			System.out.println("创建了test.txt文件");
		}catch(IOException e){
			System.out.println(e);
		}
	}
	FileOutputStream fos = null;
	try{
		fos = new FileOutputStream(file);
	}catch(FileNotFoundException e){
		System.out.println(e);
	}
	byte[] words={'h','e','l','l','o',' ','F','i','l','e',' ','I','O'};
	try{
		fos.write(words);
		fos.close();
	}catch(IOException e){
		System.out.println(e);
	}
}
};
