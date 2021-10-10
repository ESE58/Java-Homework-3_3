public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        long loanAmount = 1_000_000;
        double percent = 9.99;
        double percentMonth = percent / 12 / 100;
        double months;

        int monthlyPaymentOneYear = service.calculate(1_000_000, 0.008325, 12);
        System.out.println(monthlyPaymentOneYear);

        int monthlyPaymentTwoYears = service.calculate(1_000_000, 0.008325, 24);
        System.out.println(monthlyPaymentTwoYears);

        int monthlyPaymentThreeYears = service.calculate(1_000_000, 0.008325, 36);
        System.out.println(monthlyPaymentThreeYears);
    }
}
