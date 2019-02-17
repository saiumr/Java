import java.util.*;

class container{
public static void main(String[] args){
	List<String> list = new ArrayList<String>();
	list.add("ListItem1");
	list.add("ListItem2");
	list.add("ListItem3");
	list.add("ListItem4");
	list.add("ListItem5");
	System.out.println("list:");
	System.out.println(list);
	
	Queue<Integer> queue = new LinkedList<Integer>();
	queue.add(10);
	queue.add(20);
	queue.add(30);
	queue.add(40);
	System.out.println("queue.poll():"+queue.poll());
}
};
