package ssagnsoo.dev.productorderservice.payment;

interface PaymentGateway {
    void excute(int totalPrice, String cardNumber);
}
