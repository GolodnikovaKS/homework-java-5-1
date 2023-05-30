package ru.netology.services;

public class RestCalculation {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int restCounter = 0;

        for (int i = 1; i <= 12; i++) {
            if (money >= threshold) {
                money = (money - expenses) / 3;
                restCounter++;
            } else {
                money = money + income - expenses;
            }
        }
        return restCounter;
    }
}
