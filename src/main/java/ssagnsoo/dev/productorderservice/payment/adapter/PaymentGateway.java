package ssagnsoo.dev.productorderservice.payment.adapter;

interface PaymentGateway {
    void excute(int totalPrice, String cardNumber);
}
