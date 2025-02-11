package ssagnsoo.dev.productorderservice.product.application.service;

import org.springframework.util.Assert;
import ssagnsoo.dev.productorderservice.product.domain.DiscountPolicy;

record GetProductResponse(
        Long id,
        String name,
        int price,
        DiscountPolicy discountPolicy
) {
    GetProductResponse {
        Assert.notNull(id, "상품 ID는 필수입니다.");
        Assert.hasText(name, "상품명은 필수입니다.");
        Assert.notNull(discountPolicy, "할인 정책은 필수입니다.");
    }
}
