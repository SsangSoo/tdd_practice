package ssagnsoo.dev.productorderservice.order.adapter;

import org.springframework.stereotype.Component;
import ssagnsoo.dev.productorderservice.order.domain.Order;
import ssagnsoo.dev.productorderservice.order.OrderPort;
import ssagnsoo.dev.productorderservice.product.domain.Product;
import ssagnsoo.dev.productorderservice.product.adapter.ProductRepository;

@Component
class OrderAdapter implements OrderPort {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    private OrderAdapter(ProductRepository productRepository, OrderRepository orderRepository) {
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public Product getProductById(final Long productId) {

        return productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("상품이 존재하지 않습니다."));
    }

    @Override
    public void save(final Order order) {
        orderRepository.save(order);
    }
}
