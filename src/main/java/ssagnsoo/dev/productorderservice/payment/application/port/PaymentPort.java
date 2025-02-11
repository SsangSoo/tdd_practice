package ssagnsoo.dev.productorderservice.payment.application.port;

import ssagnsoo.dev.productorderservice.order.domain.Order;
import ssagnsoo.dev.productorderservice.payment.domain.Payment;

interface PaymentPort {
    Order getOrder(Long oderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
