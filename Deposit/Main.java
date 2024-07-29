package Deposit;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //افتتاح سپرده کوتاه مدت
        Deposit shDpst1 = new ShortDeposit();
        shDpst1.setDepositor("Marjan Bakhtiari");
        shDpst1.setAmount(BigDecimal.valueOf(2000));
        shDpst1.depositToDeposit(BigDecimal.valueOf(1000));
        shDpst1.withdrawal(BigDecimal.valueOf(100));
        shDpst1.printDeposit();
        BigDecimal prof = shDpst1.calculatedProfit(BigDecimal.valueOf(10));
        System.out.println("Profit is:"+prof);
        System.out.println("\n");

        //افتتاح سپرده بلند مدت
        Deposit lDpst1 = new LongDeposit();
        lDpst1.setDepositor("Neda Yasi");
        lDpst1.setAmount(BigDecimal.valueOf(10000000));
        lDpst1.printDeposit();
        BigDecimal profLong= lDpst1.calculatedProfit(BigDecimal.valueOf(20));
        System.out.println("Profit is:"+profLong);
        System.out.println("\n");

        //افتتاح سپرده پس انداز
        Deposit sDpst1= new SavingDeposit();
        sDpst1.setDepositor("Ali Ghazi");
        sDpst1.setAmount(BigDecimal.valueOf(0));
        sDpst1.depositToDeposit(BigDecimal.valueOf(15000000));
        sDpst1.withdrawal(BigDecimal.valueOf(3000000));
        sDpst1.printDeposit();
        BigDecimal profShort = sDpst1.calculatedProfit(BigDecimal.valueOf(0));
        System.out.println("Profit is:"+ profShort);

    }
}
