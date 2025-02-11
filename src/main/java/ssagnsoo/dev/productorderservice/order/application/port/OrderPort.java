package ssagnsoo.dev.productorderservice.order.application.port;

import ssagnsoo.dev.productorderservice.order.domain.Order;
import ssagnsoo.dev.productorderservice.product.domain.Product;

interface OrderPort {
    Product getProductById(final Long productId);

    void save(final Order order);
}
