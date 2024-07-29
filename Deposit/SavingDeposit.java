package Deposit;

import java.math.BigDecimal;

public class SavingDeposit extends Deposit{
    @Override
    public void depositToDeposit(BigDecimal a) {
        super.depositToDeposit(a);
    }

    @Override
    public void withdrawal(BigDecimal b) {
        super.withdrawal(b);
    }

    @Override
    public BigDecimal calculatedProfit(BigDecimal profitPercent) {
        return super.calculatedProfit(profitPercent);
    }

    public SavingDeposit() {
    }
}
