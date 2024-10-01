class Payment {
    void makePayment() {
        System.out.println("Making a general payment");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Making a credit card payment");
    }
}

class PayPalPayment extends Payment {
    @Override
    void makePayment() {
        System.out.println("Making a PayPal payment");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment generalPayment = new Payment();
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();

        generalPayment.makePayment();  
        creditCard.makePayment();      
        paypal.makePayment();          
    }
}
