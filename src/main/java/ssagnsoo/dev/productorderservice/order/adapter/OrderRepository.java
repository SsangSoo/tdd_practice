package ssagnsoo.dev.productorderservice.order.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import ssagnsoo.dev.productorderservice.order.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
