package ssagnsoo.dev.productorderservice.order;

import ssagnsoo.dev.productorderservice.product.Product;

interface OrderPort {
    Product getProductById(final Long productId);

    void save(final Order order);
}
