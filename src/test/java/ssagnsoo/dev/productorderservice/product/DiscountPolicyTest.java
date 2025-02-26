package ssagnsoo.dev.productorderservice.product;

import org.junit.jupiter.api.Test;
import ssagnsoo.dev.productorderservice.product.domain.DiscountPolicy;

import static org.assertj.core.api.Assertions.*;

class DiscountPolicyTest {


    @Test
    void applyDiscount() {
        final int price = 1000;

        final int discountedPrice = DiscountPolicy.NONE.applyDiscount(price);

        assertThat(discountedPrice).isEqualTo(price);
    }

    @Test
    void fix_1000_discounted_price() {
        final int price = 2000;

        final int discountedPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        assertThat(discountedPrice).isEqualTo(1000);
    }

    @Test
    void over_discounted_price() {
        final int price = 500;

        final int discountedPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);

        assertThat(discountedPrice).isEqualTo(0);
    }

}