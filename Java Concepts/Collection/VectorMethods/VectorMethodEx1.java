import java.util.*;

class VectorMethodEx1{
	public static void main(String[] args) {
		
		Vector<Integer> list = new Vector<>();
		for(int i=10; i<=100; i+=10)
			list.addElement(i);
		System.out.println(list);

		//System.out.println(list.capacity());

		// list.setSize(12);
        // System.out.println("After setting new size: " + list);
        // System.out.println("New size of the vector: " + list.size());

		// list.addElement(5);
		// System.out.println(list);

		// list.removeElementAt(3);
		// System.out.println(list);

		// list.setElementAt(7, 3);
		// System.out.println(list);

		// list.firstElement();
		// System.out.println(list);

		// Integer lastElement = list.lastElement();
        // System.out.println("The last element is: " + lastElement);	

        list.insertElementAt(9, 2);
        System.out.println(list);
    }
}