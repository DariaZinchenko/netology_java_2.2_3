public class CreditPaymentService {

    // amountOfCredit - сумма кредита в руб.
    // creditTermInYear - срок кредита в годах
    // percent - процентная савка по кредиту
    // isAnnuity - если true - платеж аннуитетный, false - дифференцированный
    public double calculate(double amountOfCredit, int creditTermInYear, double percentPerYear, boolean isAnnuity) {
        double paymentPerMonth;
        double percentPerMonth = percentPerYear / 100 / 12;
        int creditTermInMonths = creditTermInYear * 12;

        if(isAnnuity) {
            paymentPerMonth = amountOfCredit * (percentPerMonth * Math.pow(1 + percentPerMonth, creditTermInMonths)) / (Math.pow(1 + percentPerMonth, creditTermInMonths) - 1);
        } else {
            paymentPerMonth = amountOfCredit / creditTermInMonths + amountOfCredit * percentPerMonth;
        }

        paymentPerMonth = Math.round(paymentPerMonth);

        return paymentPerMonth;
    }
}
