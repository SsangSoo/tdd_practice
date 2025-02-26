package ssagnsoo.dev.productorderservice.payment;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import ssagnsoo.dev.productorderservice.ApiTest;
import ssagnsoo.dev.productorderservice.order.OrderSteps;
import ssagnsoo.dev.productorderservice.product.ProductSteps;

import static org.assertj.core.api.Assertions.*;

public class PaymentApiTest extends ApiTest {

    @Test
    void 상품주문() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        OrderSteps.상품주문요청(OrderSteps.상품주문요청_생성());
        final var request = PaymentSteps.주문결제요청_생성();

        final var response = PaymentSteps.주문결제요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
    }

}
