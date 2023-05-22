package ru.netology.services;

public class RelaxWorkCalculator {

    public int calculateRelaxMonth(int income, int expense, int threshold) {
        int account = 0;
        int relaxMonth = 0;

        for (int i = 1; i <= 12; i++) {
            if (account >= threshold) {
                int accountWithExpense = account - expense;
                account = accountWithExpense / 3;
                relaxMonth = relaxMonth + 1;
            } else {
                account = account - expense;
                account = account + income;
            }
        }

        return relaxMonth;
    }
}
