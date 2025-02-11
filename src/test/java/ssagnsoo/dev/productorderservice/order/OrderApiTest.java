package ssagnsoo.dev.productorderservice.order;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import ssagnsoo.dev.productorderservice.ApiTest;
import ssagnsoo.dev.productorderservice.product.ProductSteps;

import static org.assertj.core.api.Assertions.*;

public class OrderApiTest extends ApiTest {


    @Test
    void 상품주문() {
        ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
        final var request = OrderSteps.상품주문요청_생성();

        final var response = OrderSteps.상품주문요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());

    }

}
