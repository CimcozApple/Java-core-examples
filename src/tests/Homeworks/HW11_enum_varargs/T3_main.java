package tests.HW11_enum_varargs;

public class T3_main {

    public static void main(String[] args) {
        T3_PaymentType typeCash = T3_PaymentType.CASH;
        T3_PaymentType typeCredit = T3_PaymentType.CREDIT_CARD;
        T3_PaymentType typeMaster = T3_PaymentType.MASTER_CARD;
        T3_PaymentType typeVisa = T3_PaymentType.VISA;

        System.out.println("You can pay for your order in the next ways:" + "\n"
                + typeCash.getId() + " - " + typeCash.getPaymentType() + "\n"
                + typeCredit.getId() + " - " + typeCredit.getPaymentType() + "\n"
                + typeMaster.getId() + " - " + typeMaster.getPaymentType() + "\n"
                + typeVisa.getId() + " - " + typeVisa.getPaymentType() + "\n"
                + "Please, select the way you want to pay");
    }
}
