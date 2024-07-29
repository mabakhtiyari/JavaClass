package Deposit;

import java.math.BigDecimal;

public abstract class Deposit {
    private String depositor;
    private BigDecimal amount = BigDecimal.ZERO;

    public void depositToDeposit(BigDecimal a){
        this.amount=this.amount.add(a);

    }

    public void withdrawal(BigDecimal b){
        this.amount=this.amount.subtract(b);

    }

    public BigDecimal calculatedProfit(BigDecimal profitPercent){

        BigDecimal profit = amount.multiply(profitPercent).divide(BigDecimal.valueOf(100));
        return profit;
    }

    public String getDepositor() {
        return depositor;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setDepositor(String depositor) {
        this.depositor = depositor;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void printDeposit(){
        System.out.println("Name is:"+this.depositor + " \n" + "Amount is:" + this.amount );
    }
}
