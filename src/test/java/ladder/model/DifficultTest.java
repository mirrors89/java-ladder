package ladder.model;

import org.junit.Test;

import java.util.Random;

public class DifficultTest {

    @Test
    public void test() {
        Difficult 상 = Difficult.of("상");

        System.out.println(상);
        double randomValue = new Random().nextDouble();
        System.out.println(randomValue);

    }


}