package ru.netology.sqr;

public class SQRService {

    public int calculateCount(int minLimit, int maxLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= minLimit && x <= maxLimit) {
                count++;
            }
        }
        return count;
    }
}
