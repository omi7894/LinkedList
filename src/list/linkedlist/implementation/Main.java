package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList numbers = new LinkedList();
		numbers.addLast(10, 1);
		numbers.addLast(20, 2);
		numbers.addLast(30, 3);
		numbers.add(1, 15,  1.5);
		
		LinkedList newList = new LinkedList();
		newList.addFirst(numbers.getX(0), numbers.getY(0));
		System.out.println(newList);
		
	}

}
