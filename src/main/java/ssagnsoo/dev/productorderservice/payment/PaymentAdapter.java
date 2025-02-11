package ssagnsoo.dev.productorderservice.payment;

import org.springframework.stereotype.Component;
import ssagnsoo.dev.productorderservice.order.Order;
import ssagnsoo.dev.productorderservice.order.OrderRepository;
import ssagnsoo.dev.productorderservice.product.DiscountPolicy;
import ssagnsoo.dev.productorderservice.product.Product;

@Component
class PaymentAdapter implements PaymentPort {
    private final PaymentGateway paymentGateway;
    private final PaymentRepository paymentRepository;
    private final OrderRepository orderRepository;

    PaymentAdapter(PaymentGateway paymentGateway, PaymentRepository paymentRepository, OrderRepository orderRepository) {
        this.paymentGateway = paymentGateway;
        this.paymentRepository = paymentRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public Order getOrder(final Long oderId) {
        return orderRepository.findById(oderId)
                .orElseThrow(() -> new IllegalArgumentException("주문이 존재하지 않습니다."));
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
