package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    void deposit(double sum) {
        System.out.println(amount = amount + sum);
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("На счете не достаточно средств. У вас остаток: ",  amount);
        }
        System.out.println(amount = amount - sum);

    }
}
