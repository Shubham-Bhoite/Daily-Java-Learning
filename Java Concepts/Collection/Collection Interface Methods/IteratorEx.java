import java.util.*;

class IteratorEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 10; i++)
            list.add(i);
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            if(num % 2 != 0){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
