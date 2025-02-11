package ssagnsoo.dev.productorderservice.product.application.port;

import ssagnsoo.dev.productorderservice.product.domain.Product;

interface ProductPort {
    void save(final Product product);

    Product getProduct(Long productId);

}
