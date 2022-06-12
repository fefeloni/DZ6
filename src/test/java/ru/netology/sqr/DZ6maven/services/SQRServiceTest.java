package ru.netology.sqr.DZ6maven.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.DZ6maven.service.SQRService;
//import ru.netology.sqr.DZ6maven.service.SQRService;

public class SQRServiceTest {

    @Test
    public void testFirstPart() {
        SQRService service = new SQRService();

        int expected = 10;
        int actual = service.calcSQR(100, 399);
        //System.out.println(expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSecondPart() {
        SQRService service = new SQRService();

        int expected = 7;
        int actual = service.calcSQR(400, 699);
        //System.out.println(expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThirdPart() {
        SQRService service = new SQRService();

        int expected = 73;
        int actual = service.calcSQR(700, 10000);
        //System.out.println(expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
}


