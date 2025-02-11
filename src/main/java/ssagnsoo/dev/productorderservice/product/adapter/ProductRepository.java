package ssagnsoo.dev.productorderservice.product.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import ssagnsoo.dev.productorderservice.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
