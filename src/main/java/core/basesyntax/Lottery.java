package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        Random randomNumber = new Random();
        return new Ball(ColorSupplier.getRandomColor(), randomNumber.nextInt(101));
    }
}
