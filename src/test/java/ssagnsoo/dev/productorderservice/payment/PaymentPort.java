package ssagnsoo.dev.productorderservice.payment;

import ssagnsoo.dev.productorderservice.order.Order;

interface PaymentPort {
    Order getOrder(Long oderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
