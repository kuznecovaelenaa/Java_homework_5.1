package ru.netology.sqr;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();

        int res = service.calculateCount(500, 10_000);
        System.out.println(res);
    }
}


//package ru.netology.sqr;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        int count = 0;
//        int minLimit = 0;
//        int maxLimit = 100;
//        for (int i = 10; i <= 99; i++) {
//            int x = i * i;
//            if (x >= minLimit && x <= maxLimit) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}


