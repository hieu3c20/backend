package Jv_oop.exOOP.CafeBill;

public class CafeBill {
    private String typeCafe ;
    private double moneyOver1kg ;
    private double kg;

    public CafeBill(String typeCafe, double moneyOver1kg, double kg) {
        this.typeCafe = typeCafe;
        this.moneyOver1kg = moneyOver1kg;
        this.kg = kg;
    }

    public double sumMoney() {
        return this.moneyOver1kg * this.kg;
    }

    // this: object was created
    public boolean checkKg (double kg) {
        if (this.kg > kg) {
            return true;
        }else {
            return false;
        }
    }

    public boolean ifSumOfMoneyGreaterThan500() {
        return this.sumMoney() > 500000;
    }
}
