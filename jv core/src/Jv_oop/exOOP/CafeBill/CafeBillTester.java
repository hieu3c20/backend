package Jv_oop.exOOP.CafeBill;

public class CafeBillTester {
    public static void main(String[] args) {
        CafeBill cb = new CafeBill("Trung Nguyen", 20000, 100);
        System.out.println("Count sum of money: " + cb.sumMoney());
        System.out.println("Check kg: " + cb.checkKg(101));
        if (cb.ifSumOfMoneyGreaterThan500() == true) {
            System.out.println("Your bill greater than 500k. Concrete:" + cb.sumMoney());
        }else if(cb.ifSumOfMoneyGreaterThan500() == false) {
            System.out.println("Your bill is not greater than 500k. Concrete" + cb.sumMoney());
        }

    }
}
