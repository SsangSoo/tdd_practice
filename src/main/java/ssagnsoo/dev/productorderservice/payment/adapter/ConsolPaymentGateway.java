package ssagnsoo.dev.productorderservice.payment.adapter;

import org.springframework.stereotype.Component;

@Component
public class ConsolPaymentGateway implements PaymentGateway {

    @Override
    public void excute(int totalPrice, String cardNumber) {
        System.out.println("결제 완료");

    }
}
