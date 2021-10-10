public class CreditPaymentService {
    public int calculate(long loanAmount, double percentMonth, double months) {
        int monthlyPayment = (int) Math.round(loanAmount * (percentMonth + (percentMonth / (Math.pow((percentMonth + 1), months) - 1))));
        return monthlyPayment;
    }
}
