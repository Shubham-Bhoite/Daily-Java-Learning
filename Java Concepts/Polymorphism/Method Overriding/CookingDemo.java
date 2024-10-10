class Dish {
    void cook() {
        System.out.println("Cooking a generic dish");
    }
}

class Pizza extends Dish {
    @Override
    void cook() {
        System.out.println("Cooking a pizza");
    }
}

class Pasta extends Dish {
    @Override
    void cook() {
        System.out.println("Cooking pasta");
    }
}

public class CookingDemo {
    public static void main(String[] args) {
        Dish genericDish = new Dish();
        Dish pizza = new Pizza();
        Dish pasta = new Pasta();

        genericDish.cook();  
        pizza.cook();        
        pasta.cook();        
    }
}
