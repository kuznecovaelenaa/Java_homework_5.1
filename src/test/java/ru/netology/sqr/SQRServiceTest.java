package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testcount.csv"})

    public void testCountSQR(int minLimit, int maxLimit, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculateCount(minLimit, maxLimit);

        Assertions.assertEquals(expected, actual);
    }
}


//package ru.netology.sqr;
//
//        import org.junit.jupiter.api.Assertions;
//        import org.junit.jupiter.api.Test;
//
//public class SQRServiceTest {
//
//    @Test
//    public void testCountSQR() {
//        SQRService service = new SQRService();
//
//        int actual = service.calculateCount(500, 10_000);
//        int expected = 77;
//
//        Assertions.assertEquals(expected, actual);
//    }
//}