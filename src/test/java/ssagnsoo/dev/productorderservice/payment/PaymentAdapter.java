package ssagnsoo.dev.productorderservice.payment;

import ssagnsoo.dev.productorderservice.order.Order;
import ssagnsoo.dev.productorderservice.product.DiscountPolicy;
import ssagnsoo.dev.productorderservice.product.Product;

class PaymentAdapter implements PaymentPort {
    private final PaymentGateway paymentGateway;
    private final PaymentRepository paymentRepository;

    PaymentAdapter(PaymentGateway paymentGateway, PaymentRepository paymentRepository) {
        this.paymentGateway = paymentGateway;
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Order getOrder(final Long oderId) {
        return new Order(new Product("상품1", 1000, DiscountPolicy.NONE), 2);
    }

    @Override
    public void pay(final int totalPrice, final String cardNumber) {
        paymentGateway.excute(totalPrice, cardNumber);
    }


    @Override
    public void save(final Payment payment) {
        paymentRepository.save(payment);
    }
}
