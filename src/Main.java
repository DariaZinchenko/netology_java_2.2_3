public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        Double payment_1 = creditPaymentService.calculate(1_000_000, 1, 9.99, true);
        Double payment_2 = creditPaymentService.calculate(1_000_000, 2, 9.99, true);
        Double payment_3 = creditPaymentService.calculate(1_000_000, 3, 9.99, true);

        System.out.println(payment_1);
        System.out.println(payment_2);
        System.out.println(payment_3);
    }
}
