public class LabelFor7 {
    public static void main(String[] args) {
        int num = 5;  
        int product = 1;
        
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        
        System.out.println("Multiplication of numbers from 1 to " + num + " is: " + product);
    }
}
