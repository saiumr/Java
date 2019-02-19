import java.io.*;
import java.util.*;

public class randomAccessFile{
public static void main(String[] args){
	File file = new File("test2.txt");
	if(!file.exists()){
		System.out.println("文件不存在，创建一个");
		try{
			file.createNewFile();
		}catch(IOException e){
			System.out.println(e);
		}
	}
	RandomAccessFile raf = null;
	try{
		raf = new RandomAccessFile(file,"rw");
	}catch(FileNotFoundException e){
		System.out.println(e);
		System.out.println("文件test2.txt不存在");
	}
	try{
		String str = raf.readLine();
		while(str != null){
			System.out.println(str);
			str = raf.readLine();
		}
	}catch(IOException e){
		System.out.println(e);
	}
}
};
