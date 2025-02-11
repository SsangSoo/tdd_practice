package ssagnsoo.dev.productorderservice.payment.adapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ssagnsoo.dev.productorderservice.payment.Payment;

import java.util.HashMap;
import java.util.Map;

interface PaymentRepository extends JpaRepository<Payment, Long> {

}
