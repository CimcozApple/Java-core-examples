package tests.HW11_enum_varargs;

public enum T3_PaymentType {

    CASH(1, "Cash"),
    CREDIT_CARD(2, "Credit card"),
    MASTER_CARD(3, "Master Card"),
    VISA(4, "Visa");

    private final int id;
    private final String paymentType;

    T3_PaymentType(int id, String paymentType) {
        this.id = id;
        this.paymentType = paymentType;
    }

    public int getId() {
        return id;
    }

    public String getPaymentType() {
        return paymentType;
    }
}
