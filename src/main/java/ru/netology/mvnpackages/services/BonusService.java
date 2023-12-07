package ru.netology.mvnpackages.services;

public class BonusService {
    public int calculate(int income, int expenses) {
        int count = 0;
        int money = 0;
        int threshold = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money /= 3;

            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
