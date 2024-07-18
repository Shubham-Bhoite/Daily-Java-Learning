import java.util.*;
class StackAllMethods{
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//1.push(E)
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack); //[10,20,30]

		//2.pop()
		stack.pop();
		stack.pop();
		System.out.println(stack); //[10]

		//3.peek()
		stack.peek();
		System.out.println(stack); //[10]

		//4.empty()
		System.out.println(stack.empty()); //false

		//5.search()
		System.out.println(stack.search(20)); //2 index
	}
}