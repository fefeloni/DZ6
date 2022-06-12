package ru.netology.sqr.DZ6maven.service;

public class SQRService {
    public int calcSQR(int downBorder, int upBorder) {
        int numbersCount = 0;

        for (int i = 10; i < 100; i++) {
            int x = i * i;
            if (x >= downBorder && x <= upBorder) {
                numbersCount++;
            }
        }

        return numbersCount;
    }
}
