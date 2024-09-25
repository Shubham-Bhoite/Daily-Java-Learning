import java.util.*;

class UserStack<E> {
    LinkedList<E> list = new LinkedList<>();

    public E push(E i) {
        list.add(i);
        return i;
    }

    public E pop() {
        return list.removeLast();
    }

    public E peek() {
        return list.get(list.size() - 1);
    }

    public boolean empty() {
        return list.isEmpty();
    }

    public int search(E i) {
        for (int j = list.size() - 1, offset = 1; j >= 0; j--, offset++) {
            if (i.equals(list.get(j))) { 
                return offset;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

public class DemoOfExecution {
    public static void main(String[] args) {
        UserStack<Object> stack = new UserStack<>(); 
        for (int i = 10; i <= 100; i += 10) {
            stack.push(i);
        }
        stack.push("hello");
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.empty());
        System.out.println(stack.search(10));
    }
}
