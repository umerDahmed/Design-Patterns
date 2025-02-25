import com.payment_strategy.PaymentStrategy;

public class PaymentContext {

    int amount;
    PaymentStrategy paymentStrategy;

    public PaymentContext(int amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    void processPayment(){
        paymentStrategy.pay(amount);
    }
}
