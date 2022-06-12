import ru.netology.sqr.DZ6maven.service.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int expected = 8;
        int actual = service.calcSQR(100, 399);
        System.out.println(expected + " == ? == " + actual);
    }
}
