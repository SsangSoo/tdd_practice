package ssagnsoo.dev.productorderservice.product;

import org.junit.jupiter.api.Test;
import ssagnsoo.dev.productorderservice.product.domain.DiscountPolicy;
import ssagnsoo.dev.productorderservice.product.domain.Product;

import static org.assertj.core.api.Assertions.*;

class ProductTest {

    @Test
    void update() {
        Product product = new Product("상품명", 1000, DiscountPolicy.NONE);

        product.update("상품 수정", 2000, DiscountPolicy.NONE);

        assertThat(product.getName()).isEqualTo("상품 수정");
        assertThat(product.getPrice()).isEqualTo(2000);
    }

    @Test
    void none_discounted_product() {
        Product product = new Product("상품명", 1000, DiscountPolicy.NONE);

        final int discountPrice = product.getDiscountPrice();

        assertThat(product.getPrice()).isEqualTo(1000);
    }

    @Test
    void fix_1000_discounted_product() {
        Product product = new Product("상품명", 1000, DiscountPolicy.NONE);

        final int discountPrice = product.getDiscountPrice();

        assertThat(product.getPrice()).isEqualTo(1000);
    }
}