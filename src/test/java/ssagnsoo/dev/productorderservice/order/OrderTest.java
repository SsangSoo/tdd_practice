package ssagnsoo.dev.productorderservice.order;

import org.junit.jupiter.api.Test;
import ssagnsoo.dev.productorderservice.product.DiscountPolicy;
import ssagnsoo.dev.productorderservice.product.Product;

import static org.assertj.core.api.Assertions.*;

class OrderTest {

    @Test
    void getTotalPrice() {
        final Order order = new Order(new Product("상품명", 1000, DiscountPolicy.NONE), 2);

        final int totalPrice = order.getTotalPrice();

        assertThat(totalPrice).isEqualTo(2000);
    }
}