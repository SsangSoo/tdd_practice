package ssagnsoo.dev.productorderservice.product.application.service;

import org.springframework.util.Assert;
import ssagnsoo.dev.productorderservice.product.domain.DiscountPolicy;

record UpdateProductRequest(String name, int price, DiscountPolicy discountPolicy) {
    UpdateProductRequest {
        Assert.hasText(name, "상품명은 필수입니다.");
        Assert.isTrue(price > 0, "상품 가격은 0보다 커야 합니다.");
        Assert.notNull(discountPolicy, "할인 정책은 필수입니다.");
    }
}
