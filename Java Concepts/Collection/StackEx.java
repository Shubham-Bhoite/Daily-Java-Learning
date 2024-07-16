import java.util.Stack;

class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.capacity());
        for(int i=10; i<=110; i+=10)
        {
            stack.add(i);
        }
        System.out.println(stack.capacity());
    }
}

