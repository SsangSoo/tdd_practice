package ssagnsoo.dev.productorderservice.payment;

public class ConsolPaymentGateway implements PaymentGateway {

    @Override
    public void excute(int totalPrice, String cardNumber) {
        System.out.println("결제 완료");

    }
}
