package ssagnsoo.dev.productorderservice.product;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import ssagnsoo.dev.productorderservice.ApiTest;

import static org.assertj.core.api.Assertions.*;


public class ProductApiTest extends ApiTest {

    @Test
    void 상품등록() {
        final var request = ProductSteps.상품등록요청_생성();

        final var response = ProductSteps.상품등록요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

}